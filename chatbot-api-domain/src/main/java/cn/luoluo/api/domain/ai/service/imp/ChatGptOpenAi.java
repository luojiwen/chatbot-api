package cn.luoluo.api.domain.ai.service.imp;

import cn.luoluo.api.domain.ai.model.aggregates.AiAnswer;
import cn.luoluo.api.domain.ai.model.vo.Choices;
import cn.luoluo.api.domain.ai.service.IChatGptOpenAi;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import java.io.IOException;


/*
    ChatGPT open ai 接口
 */
@Service
public class ChatGptOpenAi implements IChatGptOpenAi {
    @Override
    public String doChatGPT(String openAiKey, String question) throws IOException {
        CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();

        String openAiUrl = "https://api.openai.com/v1/completions";
        String secretKey = "Bearer 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";
        String params = "{\"model\": \"text-davinci-003\", \"prompt\": \""+question+"\", \"temperature\": 0, \"max_tokens\": 1028}";
        StringEntity stringEntity = new StringEntity(params);

        HttpPost httpPost = new HttpPost(openAiUrl);
        httpPost.addHeader("Content-Type","application/json");
        httpPost.addHeader("Authorization",secretKey);
        httpPost.setEntity(stringEntity);

        CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String resultInfo = EntityUtils.toString(response.getEntity());
            AiAnswer aiAnswer = JSONObject.parseObject(resultInfo, AiAnswer.class);
            StringBuilder stringBuilder = new StringBuilder();
            for (Choices choice : aiAnswer.getChoices()) {
                stringBuilder.append(choice.getText());
            }
            return stringBuilder.toString();
        }else {
            throw new RuntimeException("api.openai.com Err Code is " + response.getStatusLine().getStatusCode());
        }
    }

}

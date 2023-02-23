package cn.luoluo.chatbot.api.interfaces;

import cn.luoluo.api.domain.ai.service.IChatGptOpenAi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatGptOpenAiTest {
    private Logger logger = LoggerFactory.getLogger(ChatGptOpenAiTest.class);
    @Resource
    IChatGptOpenAi ichatGptOpenAi;
    @Test
    public void doChatGPTTest() throws IOException {

        String answerResult = ichatGptOpenAi.doChatGPT(null, "nice to you");
        logger.info("测试结果：{}",answerResult);
    }
}

package cn.luoluo.api.domain.ai.service;

import java.io.IOException;

/*
    ChatGPT open ai 接口
 */
public interface IChatGptOpenAi {

    String doChatGPT(String openAiKey, String question) throws IOException;
}

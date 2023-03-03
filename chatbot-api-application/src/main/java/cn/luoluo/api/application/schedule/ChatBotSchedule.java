package cn.luoluo.api.application.schedule;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatBotSchedule implements Runnable{

    private Logger logger = LoggerFactory.getLogger(ChatBotSchedule.class);

    @Override
    public void run() {
        logger.info("我进来了哦");
    }
}


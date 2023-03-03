package cn.luoluo.chatbot.api.interfaces;

import cn.luoluo.api.domain.ai.service.IChatGptOpenAi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import javax.annotation.Resource;

@SpringBootApplication
@ComponentScan({"cn.luoluo.api"})
public class ApiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ApiApplication.class);
    }
}

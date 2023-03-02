package com.botwhy.chatgptland.config;

import com.botwhy.chatgptland.pojo.Message;
import com.botwhy.chatgptland.pojo.PromptBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfig {
    @Value("${chatgpt.model}")
    private String model;

    @Bean
    public PromptBody promptBody(){
        List<Message> messages = new ArrayList<>();
        messages.add(new Message(Const.ROLE_SYSTEM,"You are a helpful assistant."));
        System.out.println(model);
        return new PromptBody(model,messages);

    }

}

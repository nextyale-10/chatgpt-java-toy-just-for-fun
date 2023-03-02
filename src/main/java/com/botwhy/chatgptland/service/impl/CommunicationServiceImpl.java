package com.botwhy.chatgptland.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.botwhy.chatgptland.config.Const;
import com.botwhy.chatgptland.pojo.*;
import com.botwhy.chatgptland.service.CommunicationService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommunicationServiceImpl implements CommunicationService {
    @Value("${chatgpt.url}")
    private String url;
    @Value("${chatgpt.authorization}")
    private String key;
    @Value("${chatgpt.model}")
    private String model;


    @Autowired
    PromptBody promptBody;

    private PromptBody getPromptBody(){
        //used for creating local variables.
        List<Message> messages = new ArrayList<>();
        messages.add(new Message(Const.ROLE_SYSTEM,"You are a helpful assistant."));
        System.out.println(model);
        return new PromptBody(model,messages);
    }
    @Override
    public Result talkTo(UserMessage msg) {

        if (msg.getApiKey()!=null&&msg.getApiKey().length()>1){
            System.out.println("Using user's key");
            key = msg.getApiKey();
        }
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        post.addHeader("Content-Type","application/json; charset=uft-8");
        post.addHeader("Authorization","Bearer "+key);
        promptBody.getMessages().add(new Message(Const.ROLE_USER,msg.getMessage()));
        for (Message m : promptBody.getMessages()) {
            System.out.println(m.getContent());
        }

        try {
            StringEntity s = new StringEntity(JSON.toJSONString(promptBody));

            post.setEntity(s);
            HttpResponse resp = httpClient.execute(post);
            HttpEntity entity = resp.getEntity();
            String result = EntityUtils.toString(resp.getEntity());
            System.out.println(result);
            OpenAiResp oar = JSONObject.parseObject(result, OpenAiResp.class);

            return new Result(1,"ok", oar);
        } catch (IOException e) {

            return new Result(0,"error",null);
        }
    }
}

package com.botwhy.chatgptland.controller;


import com.botwhy.chatgptland.pojo.*;
import com.botwhy.chatgptland.service.CommunicationService;
import com.botwhy.chatgptland.service.impl.CommunicationServiceImpl;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/talkTo")
public class CommunicationController {

    @Autowired
    CommunicationServiceImpl service;
    @PostMapping
    public Result talkTo(HttpSession session, @RequestBody UserMessage msg){
        System.out.println(msg);
        return service.talkTo(msg);




    }
}

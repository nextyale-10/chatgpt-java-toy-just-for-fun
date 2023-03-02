package com.botwhy.chatgptland.service;

import com.botwhy.chatgptland.pojo.Result;
import com.botwhy.chatgptland.pojo.UserMessage;

public interface CommunicationService {
    public Result talkTo(UserMessage msg);
}

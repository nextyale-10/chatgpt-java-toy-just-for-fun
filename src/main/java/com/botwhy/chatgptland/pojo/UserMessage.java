package com.botwhy.chatgptland.pojo;

import java.io.Serializable;

public class UserMessage implements Serializable {
    String apiKey;
    String message;

    public UserMessage(String apiKey, String message) {
        this.apiKey = apiKey;
        this.message = message;
    }

    public UserMessage() {
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "apiKey='" + apiKey + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

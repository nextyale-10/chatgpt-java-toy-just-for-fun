package com.botwhy.chatgptland.pojo;

import java.io.Serializable;
import java.util.List;

public class PromptBody implements Serializable {
    String model;
    List<Message> messages;

    public PromptBody(String model, List<Message> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "PromptBody{" +
                "model='" + model + '\'' +
                ", messages=" + messages +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

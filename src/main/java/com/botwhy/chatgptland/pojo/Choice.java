package com.botwhy.chatgptland.pojo;

public class Choice {
    Message message;
    String finish_reason;
    Integer index;

    public Choice(Message message, String finish_reason, Integer index) {
        this.message = message;
        this.finish_reason = finish_reason;
        this.index = index;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}

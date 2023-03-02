package com.botwhy.chatgptland.pojo;

public class Result {
    Integer code;
    String msg;
    Object content;

    public Result(Integer code, String msg, Object content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}

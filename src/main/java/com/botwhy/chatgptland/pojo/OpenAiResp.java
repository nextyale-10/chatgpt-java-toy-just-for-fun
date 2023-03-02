package com.botwhy.chatgptland.pojo;


import java.io.Serializable;
import java.util.List;

public class OpenAiResp implements Serializable {
    String id;
    String object;
    Long created;
    String model;
    TokenInfo token;
    List<Choice> choices;

    public OpenAiResp(String id, String object, Long created, String model, TokenInfo token, List<Choice> choices) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.token = token;
        this.choices = choices;
    }

    public OpenAiResp() {
    }

    @Override
    public String toString() {
        return "OpenAiResp{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", created=" + created +
                ", model='" + model + '\'' +
                ", token=" + token +
                ", choices=" + choices +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TokenInfo getToken() {
        return token;
    }

    public void setToken(TokenInfo token) {
        this.token = token;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}

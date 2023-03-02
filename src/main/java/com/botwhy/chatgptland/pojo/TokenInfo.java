package com.botwhy.chatgptland.pojo;

import java.io.Serializable;

public class TokenInfo implements Serializable {
    Integer prompt_tokens;
    Integer completion_tokens;
    Integer total_tokens;

    public TokenInfo(Integer prompt_tokens, Integer completion_tokens, Integer total_tokens) {
        this.prompt_tokens = prompt_tokens;
        this.completion_tokens = completion_tokens;
        this.total_tokens = total_tokens;
    }

    public Integer getPrompt_tokens() {
        return prompt_tokens;
    }

    public void setPrompt_tokens(Integer prompt_tokens) {
        this.prompt_tokens = prompt_tokens;
    }

    public Integer getCompletion_tokens() {
        return completion_tokens;
    }

    public void setCompletion_tokens(Integer completion_tokens) {
        this.completion_tokens = completion_tokens;
    }

    public Integer getTotal_tokens() {
        return total_tokens;
    }

    public void setTotal_tokens(Integer total_tokens) {
        this.total_tokens = total_tokens;
    }
}

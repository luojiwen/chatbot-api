package cn.luoluo.api.domain.ai.model.vo;

import lombok.Data;

@Data
public class Choices {

    private String text;
    private int index;
    private String logprobs;
    private String finish_reason;


}

package cn.luoluo.api.domain.ai.model.aggregates;

import cn.luoluo.api.domain.ai.model.vo.Choices;
import cn.luoluo.api.domain.ai.model.vo.Usage;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AiAnswer {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<Choices> choices;
    private Usage usage;
}

package com.github.jewelry.pojo.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 石少东
 * @date 2020-07-02 13:29
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
public class DetailBO {

    @JsonProperty("xiaoshou")
    private String xiaoShou;

    @JsonProperty("huigou")
    private String huiGou;

    @JsonProperty("high")
    private String high;

    @JsonProperty("low")
    private String low;

    @JsonProperty("xianhuo")
    private String xianHuo;

}

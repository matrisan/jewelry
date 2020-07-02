package com.github.jewelry.pojo.bo;

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

    private String goods;

    private String repo;

    private String sell;

    private String highPrice;

    private String lowPrice;

}

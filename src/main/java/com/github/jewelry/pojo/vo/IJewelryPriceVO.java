package com.github.jewelry.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.jewelry.pojo.bo.DetailBO;

import java.util.Date;
import java.util.Map;

/**
 * @author 石少东
 * @date 2020-07-02 13:39
 * @since 1.0
 */


public interface IJewelryPriceVO {

    Map<String, DetailBO> getDetails();

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date getCreateDate();

}

package com.github.jewelry.controller;

import com.github.jewelry.pojo.dto.ResultVO;
import com.github.jewelry.pojo.vo.IJewelryCalendarVO;
import com.github.jewelry.pojo.vo.IJewelryMeasureVO;
import com.github.jewelry.pojo.vo.IJewelryNewsVO;
import com.github.jewelry.pojo.vo.IJewelryOrderVO;
import com.github.jewelry.pojo.vo.IJewelryPriceVO;

/**
 * @author 石少东
 * @date 2020-07-02 12:58
 * @since 1.0
 */


public interface IJewelryController {

    ResultVO<IJewelryPriceVO> getJewelryPrice();

    ResultVO<IJewelryNewsVO> getJewelryNews();

    ResultVO<IJewelryOrderVO> getJewelryOrder();

    ResultVO<IJewelryCalendarVO> getJewelryCalendar();

    ResultVO<IJewelryMeasureVO> getJewelryMeasure();

}

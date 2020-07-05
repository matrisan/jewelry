package com.github.jewelry.service;

import com.github.jewelry.pojo.vo.IJewelryCalendarVO;
import com.github.jewelry.pojo.vo.IJewelryMeasureVO;
import com.github.jewelry.pojo.vo.IJewelryNewsVO;
import com.github.jewelry.pojo.vo.IJewelryOrderVO;
import com.github.jewelry.pojo.vo.IJewelryPriceVO;

/**
 * @author 石少东
 * @date 2020-07-02 12:59
 * @since 1.0
 */


public interface IJewelryService {

    IJewelryPriceVO getJewelryPrice();
//    JewelryPriceDO getJewelryPrice();

    IJewelryNewsVO getJewelryNews();

    IJewelryOrderVO getJewelryOrder();

    IJewelryCalendarVO getJewelryCalendar();

    IJewelryMeasureVO getJewelryMeasure();


}

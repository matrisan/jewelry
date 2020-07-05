package com.github.jewelry.controller.impl;

import com.github.jewelry.controller.IJewelryController;
import com.github.jewelry.pojo.dto.ResultVO;
import com.github.jewelry.pojo.orm.JewelryPriceDO;
import com.github.jewelry.pojo.vo.IJewelryCalendarVO;
import com.github.jewelry.pojo.vo.IJewelryMeasureVO;
import com.github.jewelry.pojo.vo.IJewelryNewsVO;
import com.github.jewelry.pojo.vo.IJewelryOrderVO;
import com.github.jewelry.pojo.vo.IJewelryPriceVO;
import com.github.jewelry.service.IJewelryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石少东
 * @date 2020-07-02 12:59
 * @since 1.0
 */

@RequestMapping("/jewelry")
@RestController
@RequiredArgsConstructor
public class JewelryControllerImpl implements IJewelryController {

    private final IJewelryService service;

    @GetMapping("/price")
    @Override
    public ResultVO<IJewelryPriceVO> getJewelryPrice() {
        return ResultVO.success(service.getJewelryPrice());
    }
//    @Override
//    public ResultVO<JewelryPriceDO> getJewelryPrice() {
//        return ResultVO.success(service.getJewelryPrice());
//    }

    @GetMapping("/news")
    @Override
    public ResultVO<IJewelryNewsVO> getJewelryNews() {
        return ResultVO.success(service.getJewelryNews());
    }

    @GetMapping("/order")
    @Override
    public ResultVO<IJewelryOrderVO> getJewelryOrder() {
        return ResultVO.success(service.getJewelryOrder());
    }

    @GetMapping("/calendar")
    @Override
    public ResultVO<IJewelryCalendarVO> getJewelryCalendar() {
        return ResultVO.success(service.getJewelryCalendar());
    }

    @GetMapping("/measure")
    @Override
    public ResultVO<IJewelryMeasureVO> getJewelryMeasure() {
        return ResultVO.success(service.getJewelryMeasure());
    }

}

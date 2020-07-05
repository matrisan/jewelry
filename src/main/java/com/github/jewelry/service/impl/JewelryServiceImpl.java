package com.github.jewelry.service.impl;

import com.github.jewelry.pojo.vo.IJewelryCalendarVO;
import com.github.jewelry.pojo.vo.IJewelryMeasureVO;
import com.github.jewelry.pojo.vo.IJewelryNewsVO;
import com.github.jewelry.pojo.vo.IJewelryOrderVO;
import com.github.jewelry.pojo.vo.IJewelryPriceVO;
import com.github.jewelry.repository.IJewelryRepository;
import com.github.jewelry.service.IJewelryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 石少东
 * @date 2020-07-02 12:59
 * @since 1.0
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class JewelryServiceImpl implements IJewelryService {

    private final IJewelryRepository repository;

    @Override
    public IJewelryPriceVO getJewelryPrice() {
        return repository.findFirstByOrderByCreateDateDesc(IJewelryPriceVO.class);
    }
//    @Override
//    public JewelryPriceDO getJewelryPrice() {
//        return repository.findFirstByOrderByCreateDateDesc();
//    }

    @Override
    public IJewelryNewsVO getJewelryNews() {
        return null;
    }

    @Override
    public IJewelryOrderVO getJewelryOrder() {
        return null;
    }

    @Override
    public IJewelryCalendarVO getJewelryCalendar() {
        return null;
    }

    @Override
    public IJewelryMeasureVO getJewelryMeasure() {
        return null;
    }
}

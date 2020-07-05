package com.github.jewelry.repository;

import com.github.jewelry.pojo.orm.JewelryPriceDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author 石少东
 * @date 2020-07-02 13:50
 * @since 1.0
 */


public interface IJewelryRepository extends PagingAndSortingRepository<JewelryPriceDO, String> {

    JewelryPriceDO findFirstByOrderByCreateDateDesc();

    <T> T findFirstByOrderByCreateDateDesc(Class<T> clz);

}

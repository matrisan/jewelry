package com.github.jewelry.pojo.orm;

import com.github.jewelry.pojo.BaseEntity;
import com.github.jewelry.pojo.bo.DetailBO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

/**
 * @author 石少东
 * @date 2020-07-02 13:08
 * @since 1.0
 */

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "JewelryPriceDO")
public class JewelryPriceDO extends BaseEntity {

    private Map<String, DetailBO> details;

}



package com.github.jewelry.pojo.orm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * @author 石少东
 * @date 2020-07-02 13:08
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Where(clause = "deleted = false or deleted is null")
@Table(name = "JewelryNewsDO")
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class JewelryNewsDO extends BaseEntity {


}

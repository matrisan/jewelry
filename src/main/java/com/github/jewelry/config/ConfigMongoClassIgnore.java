package com.github.jewelry.config;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * @author 石少东
 * @date 2020-07-04 23:18
 * @since 1.0
 */


@Configuration
public class ConfigMongoClassIgnore {

    /**
     * _class 不保存
     *
     * @param factory     MongoDbFactory
     * @param context     MongoMappingContext
     * @param beanFactory BeanFactory
     * @return MappingMongoConverter
     */
    @Bean
    @SneakyThrows(NoSuchBeanDefinitionException.class)
    public MappingMongoConverter mappingMongoConverter(MongoDbFactory factory, MongoMappingContext context, @NotNull BeanFactory beanFactory) {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(factory);
        MappingMongoConverter mappingConverter = new MappingMongoConverter(dbRefResolver, context);
        mappingConverter.setCustomConversions(beanFactory.getBean(MongoCustomConversions.class));
        // Don't save _class to mongo
        mappingConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return mappingConverter;
    }

}

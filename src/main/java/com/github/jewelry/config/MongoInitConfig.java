package com.github.jewelry.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.stereotype.Component;

/**
 * Please use 'MongoMappingContext#setAutoIndexCreation(boolean)' or override 'MongoConfigurationSupport#autoIndexCreation()' to be explicit.
 * 	However, we recommend setting up indices manually in an application ready block. You may use index derivation there as well.
 *
 * 	> -----------------------------------------------------------------------------------------
 * 	> @EventListener(ApplicationReadyEvent.class)
 * 	> public void initIndicesAfterStartup() {
 * 	>
 * 	>     IndexOperations indexOps = mongoTemplate.indexOps(DomainType.class);
 * 	>
 * 	>     IndexResolver resolver = new MongoPersistentEntityIndexResolver(mongoMappingContext);
 * 	>     resolver.resolveIndexFor(DomainType.class).forEach(indexOps::ensureIndex);
 * 	> }
 * 	> -----------------------------------------------------------------------------------------
 *
 * @author 石少东
 * @date 2020-07-04 22:20
 * @since 1.0
 */

@Component
@RequiredArgsConstructor
public class MongoInitConfig {

    private final MongoTemplate mongoTemplate;

    private final MongoMappingContext mongoMappingContext;

    @EventListener(ApplicationReadyEvent.class)
    public void initIndicesAfterStartup() {
        System.out.println();

//        IndexOperations indexOps = mongoTemplate.indexOps(DomainType.class);
//        IndexResolver resolver = new MongoPersistentEntityIndexResolver(mongoMappingContext);
//        resolver.resolveIndexFor(DomainType.class).forEach(indexOps::ensureIndex);

//        IndexOperations userIndexOps = template.indexOps(ComplexDataDO.class);
//        userIndexOps.ensureIndex(new Index().on("name", Sort.Direction.ASC));
    }

}

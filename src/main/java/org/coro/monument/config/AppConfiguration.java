package org.coro.monument.config;

import com.microsoft.azure.spring.data.cosmosdb.config.AbstractCosmosConfiguration;
import lombok.Value;

public class AppConfiguration extends AbstractCosmosConfiguration {
    @Value("${azure.cosmosdb.uri}")
    private String uri;

    @Value("${azure.cosmosdb.key}")
    private String key;

    @Value("${azure.cosmosdb.secondaryKey}")
    private String secondaryKey;

    @Value("${azure.cosmosdb.database}")
    private String dbName;

    @Value("${azure.cosmosdb.populateQueryMetrics}")
    private boolean populateQueryMetrics;
}

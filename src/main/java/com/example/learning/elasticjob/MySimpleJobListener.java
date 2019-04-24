package com.example.learning.elasticjob;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

public class MySimpleJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {

    }
}

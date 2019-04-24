package com.example.learning.elasticjob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MyElasticJob implements SimpleJob {
    
    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0: 
                // do something by sharding item 0
                System.out.println("0-------------");
                System.out.println("taskid:"+context.getTaskId());
                System.out.println("shardingitem:"+context.getShardingItem());
                System.out.println("ShardingParameter:"+context.getShardingParameter());
                System.out.println("ShardingTotalCount:"+context.getShardingTotalCount());
                System.out.println("JobName:"+context.getJobName());
                System.out.println("JobParameter:"+context.getJobParameter());
                System.out.println("0-------------");
                break;
            case 1:
                System.out.println("1-------------");
                System.out.println("taskid:"+context.getTaskId());
                System.out.println("shardingitem:"+context.getShardingItem());
                System.out.println("ShardingParameter:"+context.getShardingParameter());
                System.out.println("ShardingTotalCount:"+context.getShardingTotalCount());
                System.out.println("JobName:"+context.getJobName());
                System.out.println("JobParameter:"+context.getJobParameter());
                System.out.println("1-------------");
                break;
            case 2:
                System.out.println("2-------------");
                System.out.println("taskid:"+context.getTaskId());
                System.out.println("shardingitem:"+context.getShardingItem());
                System.out.println("ShardingParameter:"+context.getShardingParameter());
                System.out.println("ShardingTotalCount:"+context.getShardingTotalCount());
                System.out.println("JobName:"+context.getJobName());
                System.out.println("JobParameter:"+context.getJobParameter());
                System.out.println("2-------------");
                break;
            // case n: ...
        }
    }
}
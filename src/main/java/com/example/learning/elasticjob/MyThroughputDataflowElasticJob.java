package com.example.learning.elasticjob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.Arrays;
import java.util.List;

public class MyThroughputDataflowElasticJob implements DataflowJob<String> {

    @Override
    public List<String> fetchData(ShardingContext shardingContext) {
        List<String> data = null;
        System.out.println("fetch data:"+shardingContext.getTaskId());
        switch (shardingContext.getShardingItem()) {
            case 0:
                data = Arrays.asList(new String[]{"1", "2", "3"});
                break;
            case 1:
                data = Arrays.asList(new String[]{"4", "5", "6"});
                break;
            case 2:
                data = Arrays.asList(new String[]{"7", "8", "9"});
                break;
        }
        //返回null时，processData方法不会执行。
        return null;
    }

    @Override
    public void processData(ShardingContext shardingContext, List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s);
        }
        System.out.println("process:" + sb.toString());

    }
}

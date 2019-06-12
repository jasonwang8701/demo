package com.jason.wy.demoservice.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.util.Date;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-10 17:13
 */
public class MySimpleJob implements SimpleJob {


    @Override
    public void execute(ShardingContext shardingContext) {


        System.out.println(shardingContext.getJobName() + "---" + shardingContext.getShardingParameter() + "---" + shardingContext.getShardingItem() +
                "---" + shardingContext.getShardingTotalCount() + new Date());
    }
}

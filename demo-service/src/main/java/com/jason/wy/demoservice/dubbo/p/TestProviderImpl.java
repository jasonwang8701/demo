package com.jason.wy.demoservice.dubbo.p;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-12 10:04
 */

@Service
public class TestProviderImpl implements TestProvider {

    @Override
    public String test(String s) {
        return "echo:" + s;
    }
}

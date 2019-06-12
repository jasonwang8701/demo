package com.jason.wy.demoservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-12 17:40
 */

@Service("test1")
public class Test1Service extends TestABService {

    @Override
    public String getB() {
        return "1b";
    }
}

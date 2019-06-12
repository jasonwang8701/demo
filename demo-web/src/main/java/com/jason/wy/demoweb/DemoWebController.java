package com.jason.wy.demoweb;


import com.jason.wy.democommon.annotation.TestAnnotation;
import com.jason.wy.demoservice.TestABService;
import com.jason.wy.demoservice.TestService;
import com.jason.wy.demoservice.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-05 11:16
 */
@RestController
public class DemoWebController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Resource
    private TestService testService;


    @Resource
    private RedisUtil redisUtil;


    @Resource(name = "test1")
    private TestABService testABService;

    @Resource(name = "test2")
    private TestABService d;


    @RequestMapping("ab")
    public String test2() {
        String a = testABService.get() + testABService.getB() + d.getB();
        return a;

    }

    @RequestMapping("test")
    @TestAnnotation(name = "注解式拦截的con操作")
    public String test() {
        logger.info("this is a logger!!!!!!");
        String key = "wy2";
        String value = "controller" + testService.getService();
        if (!redisUtil.hasKey(key)) {
            redisUtil.set(key, value);
        }
        return redisUtil.get(key);

    }
}

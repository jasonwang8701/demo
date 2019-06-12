package com.jason.wy.demoservice;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jason.wy.democommon.annotation.TestAnnotation;
import com.jason.wy.demodao.Dao.DO.MemberDO;
import com.jason.wy.demodao.Dao.DAO.DemoDao;
import com.jason.wy.demoservice.dubbo.p.TestProvider;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-06 10:50
 */

@Service
public class TestService implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    @Resource
    private DemoDao demoDao;


    @Reference(lazy = true,check = false)
    private TestProvider testProvider;


    @TestAnnotation(name = "注解式拦截的service操作")
    public String getService() {
        String echo = (testProvider.test("this test dubbo "));
        System.out.println(echo);
        List<MemberDO> asd = demoDao.findAllUser();
        System.out.println(asd);
        return "serivce";
    }
}

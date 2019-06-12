package com.jason.wy.demoservice;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jason.wy.democommon.annotation.TestAnnotation;
import com.jason.wy.demodao.Dao.DAO.DemoDao;
import com.jason.wy.demodao.Dao.DO.MemberDO;
import com.jason.wy.demoservice.dubbo.p.TestProvider;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-06 10:50
 */


public abstract class TestABService {


    public String get() {
        return "back";
    }

    public abstract String getB();
}

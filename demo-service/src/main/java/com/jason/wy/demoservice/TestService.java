package com.jason.wy.demoservice;

import com.jason.wy.demodao.Dao.DemoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-06 10:50
 */

@Service
public class TestService {


    @Resource
    private DemoDao demoDao;


    public String getService() {
        return "serivce" + demoDao.getDao();
    }
}

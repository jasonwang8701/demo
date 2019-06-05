package com.jason.wy.demoweb;

import com.jason.wy.demobiz.DemoBizService;
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


    @Resource
    DemoBizService demoBizService;

    @RequestMapping("test")
    public String nameD() {
        return demoBizService.name();
    }
}

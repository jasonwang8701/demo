package com.jason.wy;


import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(exclude = {/*DataSourceAutoConfiguration.class,*/ RedisAutoConfiguration.class})
@MapperScan("com.jason.wy.demodao.Dao")
@ServletComponentScan("com.jason.wy.demoweb.filter")
@DubboComponentScan
@EnableDubbo
public class DemoWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }


}

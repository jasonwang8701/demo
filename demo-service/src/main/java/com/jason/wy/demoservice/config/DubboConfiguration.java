package com.jason.wy.demoservice.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-12 09:44
 */
@Configuration
public class DubboConfiguration {


    @Value("${regCenter.serverList}")
    private String serverList;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider-test");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://" + serverList);
       // registryConfig.setClient("curator");
        registryConfig.setCheck(Boolean.FALSE);
        return registryConfig;
    }
}

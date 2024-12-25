package com.example.emptystart.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreadPoolConfig implements InitializingBean {


    @Value("${thread.config.num:#{T(java.lang.Runtime).getRuntime().availableProcessors()*2}}")
    private int availableCores;



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(availableCores);
    }
}

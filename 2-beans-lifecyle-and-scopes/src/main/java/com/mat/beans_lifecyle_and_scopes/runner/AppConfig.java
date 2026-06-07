package com.mat.beans_lifecyle_and_scopes.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BeanLifecycleRunner beanLifecycleRunner(ApplicationContext context) {
        return new BeanLifecycleRunner(context);
    }
}

package com.mat.beans_lifecyle_and_scopes.config;

import com.mat.beans_lifecyle_and_scopes.domain.MiBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MiBeanCOnfig {
    @Bean
    @Scope("prototype")  // lo voy a cambair entre singleton y prototype para ver la diferencia
    public MiBean miBean() {
        return new MiBean();
    }
}

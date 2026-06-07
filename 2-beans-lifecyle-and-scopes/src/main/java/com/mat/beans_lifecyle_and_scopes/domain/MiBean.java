package com.mat.beans_lifecyle_and_scopes.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
public class MiBean implements  AutoCloseable{
    private static long counter = 0;

    private Long id;
    private String name;
    private static Logger logger = LoggerFactory.getLogger(MiBean.class);

    public MiBean(){
        this.id = ++counter;
        this.name = "Bean-" + this.id;
    }

    @PostConstruct
    public void init(){
        logger.info("Inicializando bean con id: {} y nombre: {}", id, name);
    }

    @PreDestroy
    public void toDestroy(){
        logger.info("Destruyendo bean con id: {}", id);
    }

    @Override
    public void close() throws Exception {
        logger.info("Destruyendo bean con id: {} (manual)", id);
    }

}

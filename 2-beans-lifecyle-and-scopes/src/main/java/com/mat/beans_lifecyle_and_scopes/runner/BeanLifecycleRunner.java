package com.mat.beans_lifecyle_and_scopes.runner;

import com.mat.beans_lifecyle_and_scopes.domain.MiBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

public class BeanLifecycleRunner implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(BeanLifecycleRunner.class);
    private final ApplicationContext context;

    public BeanLifecycleRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            MiBean bean = context.getBean(MiBean.class);
            logger.info("Obtenido bean con id: {}", bean.getId());
            bean.close(); //cerrar cuando sea con prototype y usemos autocloasable, si es singleton spring lo gestiona ahsta que cierre la app
        }
    }
}



package com.mat.registro_manual_de_beans.config;

import com.mat.registro_manual_de_beans.domain.Calculadora;
import com.mat.registro_manual_de_beans.domain.ProcesadorPagos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterProcesadorPagosBean {
    public static Logger logger = LoggerFactory.getLogger(RegisterProcesadorPagosBean.class);
    @Bean
    ProcesadorPagos procesadorPagos(Calculadora calculadora){
        logger.info("LLAMANDO AL BEAN DE PROCESADOR DE PAGOS");
        return new ProcesadorPagos(calculadora);
    }

    @Bean
    Calculadora calculadora(){
        logger.info("LLAMANDO AL BEAN DE CALCULADORA");
        return new Calculadora();
    }
}

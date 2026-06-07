package com.mat.registro_manual_de_beans.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculadora {

    private static  final Logger logger = LoggerFactory.getLogger(Calculadora.class);

    public Calculadora(){
        logger.info("CALCULADORA CONSTRUIDA");
    }

    public double aplicarAumento(double monto, int porcentaje){

        if (porcentaje > 100 || porcentaje < 0){
            logger.error("porcentaje {} invalido, será seteado a 0", porcentaje);
            porcentaje = 0;
        }

        logger.info("Aplicando aumento de {}% al monto: {}", porcentaje, monto);

        return monto * ( 1 + (double) porcentaje / 100);
    }

    public double aplicarDescuento(double monto, int porcentaje){

        if (porcentaje > 100 || porcentaje < 0){
            logger.error("porcentaje: {} invalido, será seteado a 0", porcentaje);
            porcentaje = 0;
        }
        logger.info("Aplicando descuento de {}% al monto: {}", porcentaje, monto);
        return monto - (monto * (double) porcentaje / 100);
    }
}

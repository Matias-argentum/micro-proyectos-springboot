package com.mat.registro_manual_de_beans.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcesadorPagos {

    private final Calculadora calculadora;
    private static Logger logger = LoggerFactory.getLogger(Calculadora.class);

    public ProcesadorPagos(Calculadora calculadora) {
        this.calculadora = calculadora;
        logger.info("PROCESADOR DE PAGOS CONSTRUIDO");
    }

    public double procesarPago(double monto, int porcentaje,  String tipo){
        if (tipo.equals("aumento")){
            return calculadora.aplicarAumento(monto, porcentaje);
        }else if(tipo.equals("descuento")){
            return calculadora.aplicarDescuento(monto, porcentaje);
        }else{
            logger.info("El monto queda igual porque el tipo es invalido");
            return monto;
        }
    }

}

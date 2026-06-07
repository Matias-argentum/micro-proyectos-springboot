package com.mat.registro_manual_de_beans.controller;

import com.mat.registro_manual_de_beans.domain.ProcesadorPagos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PagosController {

    private final ProcesadorPagos procesadorPagos;
    private static final Logger logger = LoggerFactory.getLogger(PagosController.class);

    public PagosController(ProcesadorPagos procesadorPagos) {
        logger.info("CONSTRUYENDO PAGOS CONTROLLER");
        this.procesadorPagos = procesadorPagos;
    }

    @GetMapping("/payment")
    public String calculate(@RequestParam double monto,
                            @RequestParam (defaultValue = "0")int porcentaje,
                            @RequestParam(defaultValue = "") String tipo){

        logger.info("Dentro del controller");

        StringBuilder sb  = new StringBuilder();
        sb.append("Monto original: ").append(monto).append("<br>")
                .append("Aplicando ").append(tipo).append(" de ").append(porcentaje).append("%...<br>")
                .append("Monto calculado: ").append(procesadorPagos.procesarPago(monto, porcentaje, tipo));


        return sb.toString();
    }
}

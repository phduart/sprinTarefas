package br.com.duarte.springTarefas.controller;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component @EnableScheduling
public class AgendamentoController {

    private final long SEGUNDO = 1000;
    private final long MINUTO = SEGUNDO * 60;
    private final long HORA = MINUTO * 60;
    private static final String TIME_ZONE = "America/Sao_Paulo";

    @Scheduled(cron = "0 0 12 \\* \\* \\*", zone = TIME_ZONE) public void verificaPorHora() {
        System.out.println(LocalDateTime.now());
        // Código que realiza a consulta de fluxo de vendas
    }
}

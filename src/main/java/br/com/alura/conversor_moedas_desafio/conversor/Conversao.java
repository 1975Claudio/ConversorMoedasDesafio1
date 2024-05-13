package br.com.alura.conversor_moedas_desafio.conversor.menu;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Conversao {
    String result = "";
    String time_last_update_utc = "";
    String base_code = "";
    String target_code = "";
    Double conversion_rate = 0.0;
    Double conversion_result = 0.0;

    public String getResult() {
        return result;
    }

    public String getTime_last_update_utc() {
        ZonedDateTime agora = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        return dataHoraFormatada;
    }

    public String getBase_code() {
        return base_code;
    }

    public Double getConversion_result() {
        return conversion_result;
    }

    public String getTarget_code() {
        return target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public String toString() {
        return "======================================================\n" +
                "Resultado da conversão \n" +
                "Data da convesão = " + time_last_update_utc + '\n' +
                "Moeda base = " + base_code + '\n' +
                "Moeda alvo = " + target_code + '\n' +
                "Taxa de convesão = " + conversion_rate + '\n' +
                "Valor convertido = " + conversion_result;
    }
}
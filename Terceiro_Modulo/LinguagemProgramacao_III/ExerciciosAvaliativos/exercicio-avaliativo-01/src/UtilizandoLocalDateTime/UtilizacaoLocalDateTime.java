package UtilizandoLocalDateTime;

import java.time.LocalDateTime;

public class UtilizacaoLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime dataEntradaDoEstacionamento = LocalDateTime.of(2023, 8, 25, 10, 30, 02);

        System.out.println("Teste - Pegar ano de entrada: " + dataEntradaDoEstacionamento.getYear());
        System.out.println("Teste - Pegar mes de entrada: " + dataEntradaDoEstacionamento.getMonth());
        System.out.println("Teste - Pegar dia de entrada: " + dataEntradaDoEstacionamento.getDayOfMonth());
        System.out.println("Teste - Trocar dia de entrada: " + dataEntradaDoEstacionamento.withDayOfMonth(31));
        System.out.println("Teste - Pegar minuto de entrada: " + dataEntradaDoEstacionamento.getMinute());
        System.out.println("Teste - Pegar hora de entrada: " + dataEntradaDoEstacionamento.getHour());

    }

}
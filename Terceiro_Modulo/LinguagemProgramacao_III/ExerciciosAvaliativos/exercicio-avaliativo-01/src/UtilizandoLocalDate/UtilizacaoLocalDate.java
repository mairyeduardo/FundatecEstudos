package UtilizandoLocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UtilizacaoLocalDate {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.of(2023, 8, 29);
        LocalDate diaHoje = LocalDate.now();

        System.out.println(diaHoje);
        System.out.println("Teste - Pegar ano: " + dataNascimento.getYear());
        System.out.println("Teste - Pegar mes: " + dataNascimento.getMonth());
        System.out.println("Teste - Pegar dia: " + dataNascimento.getDayOfMonth());
        System.out.println("Teste - Nasceu Hoje?: " + dataNascimento.equals(diaHoje));
        LocalDate testeBefore = LocalDate.of(2021, 8, 29);
        System.out.println("Teste - TesteBefore é antes da data de nascimento? " + testeBefore.isBefore(dataNascimento));
    }

}
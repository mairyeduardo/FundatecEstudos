package br.org.fundatec.util;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class Teclado,
 * utilizada para Iniciar Scanner, ler dados do tipo string e Inteiro.
 */
public class Teclado {

    public static String lerString(String mensagem) {
        return  newTeclado(mensagem).nextLine();
    }

    public static  Integer lerInteiro(String mensagem) {
        try {
            return  newTeclado(mensagem).nextInt();
        }catch (InputMismatchException e) {
            return -1;
        }
    }

    private static Scanner newTeclado(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

}

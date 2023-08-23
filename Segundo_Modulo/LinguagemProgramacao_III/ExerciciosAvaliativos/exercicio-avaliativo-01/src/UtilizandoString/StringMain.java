package UtilizandoString;

import java.time.LocalDate;

public class StringMain {
    public static void main(String[] args) {

        UtilizacaoString stringClass = new UtilizacaoString();

        String nomeUsuario = "Pedro Alvares Cabral";

        System.out.println("Teste Nome Maiusculo: " + stringClass.aumentarNome(nomeUsuario));
        System.out.println("Teste Nome Minusculo: " + stringClass.diminuirNome(nomeUsuario));
        System.out.println("Teste Quantidade de caracteres: " + stringClass.qntCaracteres(nomeUsuario));
        System.out.println("Teste Nome concatenado III" + stringClass.concatenarIIIAoNome(nomeUsuario));
        System.out.println("Teste Nome Repetido 3 vezes: " + stringClass.repetirNome3Vezes(nomeUsuario));
        System.out.println("Teste Trocar letra a por z: " + stringClass.trocarLetraAPorZ(nomeUsuario));
        System.out.println("Teste Trocar Pedro por Jordan: " + stringClass.trocarPedroPorJordan(nomeUsuario));
        System.out.println("Teste Verificar se nome possui letra b : " + stringClass.verificarLetraB(nomeUsuario));
        System.out.println("Teste Ultima letra igual = l : " + stringClass.ultimaLetra(nomeUsuario));
        System.out.println("Teste Primeira letra igual = P : " + stringClass.primeiraLetra(nomeUsuario));
        System.out.println("Teste Verificar se nome esta vazio " + stringClass.verificarSeNomeVazio(nomeUsuario));
        String [] separador = stringClass.separarString(nomeUsuario);
        for (int i = 0; i < separador.length; i++){
            System.out.println(separador[i]);
        }

    }
}
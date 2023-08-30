package UtilizandoList;

import java.util.ArrayList;
import java.util.List;

public class UtilizacaoList {

    public static void main(String[] args) {
        List<String> listaMotos= new ArrayList<>();
        listaMotos.add("Susuki Yes");
        listaMotos.add("Honda Fan");
        listaMotos.add("Honda PCX");

        System.out.println("Teste - Adicionar nova moto Susuki GSR: " + listaMotos.set(0, "Susuki GSR"));
        System.out.println("Teste - Pegar a primeira moto da lista: " + listaMotos.get(0));
        System.out.println("Teste - Quantidade de motos na lista: " + listaMotos.size());
        System.out.println("Teste - Verificar se contem a moto Honda PCX: " + listaMotos.contains("Honda PCX"));
        System.out.println("Teste - Verificar se a lista esta vazia: " + listaMotos.isEmpty());
        System.out.println("Teste - Remover: " + listaMotos.remove(0));
        System.out.println("Verificar se foi removida: " + listaMotos);
    }

}
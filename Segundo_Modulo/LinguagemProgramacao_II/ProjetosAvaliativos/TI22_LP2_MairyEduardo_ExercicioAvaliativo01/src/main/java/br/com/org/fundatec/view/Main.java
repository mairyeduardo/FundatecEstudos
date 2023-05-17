package br.com.org.fundatec.view;

import br.com.org.fundatec.model.Bicicleta;
import br.com.org.fundatec.model.Carro;
import br.com.org.fundatec.model.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuOpcao();
    }

    public static void menuOpcao(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira tipo de veiculo: (carro/moto/bicicleta)");
        String opcao = teclado.nextLine();

        switch (opcao){
            case "carro":
            case "Carro":
            case "CARRO":
                cadastrarCarro();
                break;
            case "moto":
            case "Moto":
            case "MOTO":
                cadastrarMoto();
                break;
            case "bicicleta":
            case "Bicicleta":
            case "BICICLETA":
                cadastrarBicicleta();
                break;
        }
    }


    public static void cadastrarCarro(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a marca:");
        String marca = teclado.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        Carro carro = new Carro(marca, modelo);
    }

    public static void cadastrarMoto(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a marca:");
        String marca = teclado.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        Moto moto = new Moto(marca, modelo);
    }

    public static void cadastrarBicicleta(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a marca:");
        String marca = teclado.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        Bicicleta bicicleta = new Bicicleta(marca, modelo);
    }

}
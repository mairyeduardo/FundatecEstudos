package br.com.org.fundatec.view;

import br.com.org.fundatec.model.Bicicleta;
import br.com.org.fundatec.model.Carro;
import br.com.org.fundatec.model.Moto;
import br.com.org.fundatec.model.Veiculo;

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
        Veiculo carro = new Carro(marca, modelo);

        System.out.println("Defina o tempo de uso do estacionamento:");
        Double tempo = teclado.nextDouble();
        System.out.println("Informações do veiculo: marca = " + carro.getMarca() + ", modelo = " + carro.getModelo());
        carro.calculoTarifa(tempo);
    }

    public static void cadastrarMoto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a marca:");
        String marca = teclado.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        Veiculo moto = new Moto(marca, modelo);

        System.out.println("Defina o tempo de uso do estacionamento:");
        Double tempo = teclado.nextDouble();
        System.out.println("Informações do veiculo: marca = " + moto.getMarca() + ", modelo = " + moto.getModelo());
        moto.calculoTarifa(tempo);
    }

    public static void cadastrarBicicleta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a marca:");
        String marca = teclado.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = teclado.nextLine();
        Veiculo bicicleta = new Bicicleta(marca, modelo);

        System.out.println("Defina o tempo de uso do estacionamento:");
        Double tempo = teclado.nextDouble();
        System.out.println("Informações do veiculo: marca = " + bicicleta.getMarca() + ", modelo = " + bicicleta.getModelo());
        bicicleta.calculoTarifa(tempo);

    }
}
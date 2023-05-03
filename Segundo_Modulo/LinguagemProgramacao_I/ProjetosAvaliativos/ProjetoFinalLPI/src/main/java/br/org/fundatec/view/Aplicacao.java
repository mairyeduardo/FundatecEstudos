package br.org.fundatec.view;

import br.org.fundatec.controller.VotoController;
import br.org.fundatec.exception.ErroExcecao;
import br.org.fundatec.util.Teclado;
import java.util.Calendar;

/**
 * class Aplicacao,
 * roda o programa.
 */
public class Aplicacao {
    private static VotoController controller = new VotoController();

    private static boolean sair = false;
    public static void main(String[] args) {
        while (!sair) {
            telaMenu();
            int opcao = Teclado.lerInteiro("Informe a Operação desejada:");
            escolhaMenu(opcao);
        }
    }

    public static void telaMenu(){
        System.out.println("+--------------------------------+");
        System.out.println("| (1) Cadastrar Voto             |");
        System.out.println("| (2) Listar Funcionários        |");
        System.out.println("| (3) Listar Restaurantes        |");
        System.out.println("| (4) Apurar Votação do Dia      |");
        System.out.println("| (0) Encerrar Programa          |");
        System.out.println("+________________________________+");
    }

    public static void escolhaMenu(int opt) {

        try {
            switch (opt) {
                case 1:
                    cadastroVotos();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    listarRestaurantes();
                    break;
                case 4:
                    apurarVotacao();
                    break;
                case 0:
                    sair = true;
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opcão inválida, tente novamente:");
                    break;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void cadastroVotos() throws ErroExcecao {
        String nomeFuncionario = Teclado.lerString("Informe o nome do Funcionario:");
        isNumber(nomeFuncionario);
        String nomeRestaurante = Teclado.lerString("Informe o nome do Restaurante Votado:");
        isNumber(nomeRestaurante);

        controller.inserirVotacao(nomeFuncionario, nomeRestaurante);
        System.out.println("Voto cadastrado!");
    }


    private static void isNumber(String valor) throws ErroExcecao {
        try {
            Integer.parseInt(valor);
            throw new ErroExcecao("O valor não pode ser numerico");
        } catch (NumberFormatException e) {

        }
    }

    private static  void listarFuncionarios() {
        System.out.println(controller.listarFuncionarios());
    }

    private static  void listarRestaurantes() {
        System.out.println(controller.listarRestaurantes());
    }

    private static void apurarVotacao(){
        System.out.println(controller.apurarVotos());
    }

}
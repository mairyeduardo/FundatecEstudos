package TrabalhoJDBC;

import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class MenuPrincipalAgenda {
    public static void main(String[] args) {
        menuAplicacao();
    }
    private static Scanner getScanner() {
        Scanner teclado = new Scanner(System.in);
        return teclado;
    }
    public static void menuAplicacao(){

        Scanner teclado = getScanner();
        int opcao;

        do {
            menuPrincipal();
            opcao = teclado.nextInt();

            if(opcao == 1) {
                inserirRegistro();
            } else if (opcao == 2) {
                excluirRegistro();
            } else if (opcao == 3) {
                System.out.println("Não implementado!");
            } else if (opcao == 4) {
                System.out.println("Não implementado!");
            } else if (opcao == 0) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção invalida, digite novamente!");
            }

        } while (opcao != 0);
    }
    public static void menuPrincipal(){
        System.out.println("+--------------------------------+");
        System.out.println("| Selecione a Operação desejada: |");
        System.out.println("| (1) Adicionar contato          |");
        System.out.println("| (2) Excluir contato            |");
        System.out.println("| (3) Listar contatos            |");
        System.out.println("| (4) Pesquisar contato por nome |" );
        System.out.println("| (0) Encerrar                   |");
        System.out.println("+________________________________+");
    }
    public static void retornarMenu() {
        Scanner teclado = getScanner();
        System.out.println("Deseja retornar ao menu? (S/N)");
        String opcao = teclado.nextLine();

        if(opcao.equalsIgnoreCase("s")){
            System.out.println("Retornando ao menu...");
            // menuAplicacao();
        } else if (opcao.equalsIgnoreCase("n")) {
            System.out.println("Obrigado por utilizar o programa!");
            System.exit(0);
        } else {
            System.out.println("Digite 'S' para retornar ao menu ou 'N' para finalizar o programa!");
            System.out.println("------------------------------------------------------------------");
            retornarMenu();
        }
    }
    public static void inserirRegistro() {

        Scanner teclado = getScanner();

        Agenda registro = new Agenda();

        System.out.println("Insira um id:");
        registro.setId(teclado.nextInt());
        teclado.nextLine();
        System.out.println("Insira um nome:");
        registro.setNome(teclado.nextLine());
        System.out.println("Insira um sobrenome:");
        registro.setSobrenome(teclado.nextLine());
        System.out.println("Insira um idade:");
        registro.setIdade(teclado.nextInt());

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = ConexaoDB.getConexao();

            String sql = "INSERT INTO REGISTRO (id, nome, sobrenome, idade) " + "VALUES (?, ?, ?, ?)";

            stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, registro.getId());
            stmt.setString(2, registro.getNome());
            stmt.setString(3, registro.getSobrenome());
            stmt.setInt(4, registro.getIdade());

            stmt.executeUpdate();

            System.out.println("Registro inserido na tabela!!!");
            retornarMenu();

        }catch (JdbcSQLIntegrityConstraintViolationException e){
            System.out.println("Id já existente.");
            retornarMenu();
        } catch (SQLException se) {
            se.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
                retornarMenu();
            }
        }
    }
    public static void excluirRegistro(){
        Scanner teclado = getScanner();

        Agenda registro = new Agenda();
        System.out.println("Insira o id do Registro que deseja excluir:");
        registro.setId(teclado.nextInt());

        Connection conexao = null;
        PreparedStatement stmt = null;

        try {
            conexao = ConexaoDB.getConexao();

            String sql = "DELETE FROM REGISTRO " + "WHERE id = ?";

            stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, registro.getId());

            int contador = stmt.executeUpdate();

            if (contador > 0) {
                System.out.println("Registro Excluido!!!");
                retornarMenu();
            } else {
                System.out.println("Este registro não existe na tabela...");
                retornarMenu();
            }

        } catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
                retornarMenu();
            }
        }
    }
}
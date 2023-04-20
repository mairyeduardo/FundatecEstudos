package TrabalhoAgendaLocal;
import java.util.Scanner;
import java.time.LocalDate;

public class TesteListaTelefonica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Agenda agenda = new Agenda();
        String opcao;

        do {
            System.out.println("Deseja Adicionar um contato em sua agenda? (S/N)");
            opcao = teclado.nextLine();

            switch (opcao.toUpperCase()) {
                case "S":
                    // System.out.println("Adicione um Contato na sua Agenda: ");
                    agenda.adicionarContato(new Contato("Lucas","lucasgaluduck@gmail.com", LocalDate.of(2002,01,20), 986934222));
                    agenda.adicionarContato(new Contato("Guilheme","guiga22@gmail.com",LocalDate.of(2000,05,28), 987542631));
                    agenda.adicionarContato(new Contato("Mauiricio","mauricio2034@gmail.com",LocalDate.of(1996,04,04),987456933));
                    agenda.adicionarContato(new Contato("Aluisio","aluisio222@gmail.com",LocalDate.of(1996,04,10),987456563));
                    System.out.println("Contato Adicionado!");
                    break;

                case "N":
                    agenda.listarContatosPorOrdem();
                    agenda.listarAniversariante();
                    break;
            }
        } while (opcao.equalsIgnoreCase("S"));

    }
}
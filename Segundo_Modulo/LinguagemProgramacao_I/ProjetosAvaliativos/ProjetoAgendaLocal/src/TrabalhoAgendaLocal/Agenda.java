package TrabalhoAgendaLocal;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
    private Set<Contato> contatos;

    public Agenda(){
        this.contatos = new TreeSet<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public Set<Contato> getContatos() {
        return contatos;
    }

    public void listarAniversariante (){
        for (Contato contato : contatos) {
            if (contato.aniversarioHoje()){
                System.out.println("| "+contato.getNome() + " Está de aniversario hoje!                                                       |");
                System.out.println("|___________________________________________________________________________________________|");
            } else {
                System.out.println("| "+contato.getNome() + " Não faz aniversario hoje!                                                       |");
                System.out.println("|___________________________________________________________________________________________|");
            }
        }
    }



    public void listarContatosPorOrdem() {

        System.out.println();
        System.out.println(" ___________________________________________________________________________________________");
        System.out.println("| LISTA DE CONTATOS DE CONTATOS DA AGENDA                                                   |");
        System.out.println("|                                                                                           |");
        System.out.println("|___________________________________________________________________________________________|");
        System.out.printf("| %-15s | %-40s | %-8s | %-10s | %n", "NOME", "EMAIL", "DATA NASCIMENTO", "TELEFONE");
        System.out.println("|___________________________________________________________________________________________|");

        for (Contato contato : contatos) {
            System.out.printf("| %-15S | %-40s | %-15s | %-10s | %n", contato.getNome(), contato.getEmail(),
                    contato.getDataNascimento(), contato.getTelefone());
        }

        System.out.println("|___________________________________________________________________________________________|");
    }


}
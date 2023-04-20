
package TrabalhoAgendaLocal;
import java.time.LocalDate;

public class Contato implements Comparable<Contato> {

    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private Integer telefone;

    public Contato(String nome, String email, LocalDate dataNascimento, Integer telefone) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public int compareTo(Contato contato) {
        return this.getNome().compareTo(contato.getNome());
    }

    public boolean aniversarioHoje(){
        LocalDate localDate = LocalDate.now();
        int mesAtual = localDate.getMonthValue();

        if(mesAtual == getDataNascimento().getMonthValue() && localDate.getDayOfMonth() == getDataNascimento().getDayOfMonth()){
            return true;
        }

        return false;
    }
}
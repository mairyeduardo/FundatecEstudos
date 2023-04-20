package TesteOrdenacao;

public class Pessoa implements Comparavel{

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }


    public int comparar(Object o){
        int comparacao = 0;

        if(o instanceof Pessoa){
            Pessoa pessoa = (Pessoa) o;
            comparacao = this.getNome().compareTo(pessoa.getNome());
        }

        return comparacao;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
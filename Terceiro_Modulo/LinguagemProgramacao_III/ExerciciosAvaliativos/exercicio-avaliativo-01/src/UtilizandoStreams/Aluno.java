package UtilizandoStreams;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String cpf;
    private String curso;
    private LocalDate dataNascimento;

    public Aluno(String nome, String cpf, String curso, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(String curso) throws Exception {
        System.out.println("Alterando o curso....");
        if (curso.length() < 3){
            throw new Exception("não é possivel setar um curso com menos de 3 letras");
        } else {
            System.out.println("Curso Setado com Sucesso!");
        }

        this.curso = curso;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

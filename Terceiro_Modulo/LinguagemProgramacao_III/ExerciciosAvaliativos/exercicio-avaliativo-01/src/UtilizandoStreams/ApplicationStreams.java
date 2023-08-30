package UtilizandoStreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationStreams {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jonas",
                "213.213.342-90",
                "Tecnico Informatica",
                LocalDate.of(2023, 8, 10));

        Aluno aluno2 = new Aluno("Calango",
                "156.981.651-41",
                "Tecnico Informatica",
                LocalDate.of(2023,8,29));


        Aluno aluno3 = new Aluno("Juninho",
                "216.900.716-88",
                "Tecnico Informatica",
                LocalDate.of(2023,8,29));


        Disciplina disciplina = new Disciplina(1,
                "Linguagem de Programacao 3",
                "Lucas");

        List <Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        disciplina.setAlunos(listaAlunos);


        // filtrar sem streams
        for (int i = 0; i < listaAlunos.size(); i++){
            if (listaAlunos.get(i).getNome().startsWith("J")){
                System.out.println(listaAlunos.get(i).getNome() + " - " + listaAlunos.get(i).getCpf());
            }

        }

        System.out.println("------------------------");

        // Utilizando filter de Streams

        //pegar nomes que comecam com = J
        List<String> listaNomes = listaAlunos.stream()
                .filter(a -> a.getNome()
                        .startsWith("J"))
                .map(a -> a.getNome())
                .map(a -> a.toUpperCase())
                .toList();
        System.out.println(listaNomes);

        //pegar cpfs
        List<String> listaCpfs = listaAlunos.stream().map(a -> a.getCpf()).toList();
        System.out.println(listaCpfs);

        System.out.println("------------------------");

        //Utilizando Count de Streams

        long numeroAlunosComLetraO = listaAlunos.stream().filter(c -> c.getNome().contains("J")).count();
        System.out.println(numeroAlunosComLetraO);

    }
}

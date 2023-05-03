package br.org.fundatec.controller;

import br.org.fundatec.exception.ErroExcecao;
import br.org.fundatec.model.Apuracao;
import br.org.fundatec.model.Funcionario;
import br.org.fundatec.model.Restaurante;
import br.org.fundatec.model.Voto;
import br.org.fundatec.repository.FuncionarioRepositorio;
import br.org.fundatec.repository.RestauranteRepositorio;
import br.org.fundatec.repository.VotoRepositorio;
import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

/**
 * class VotoController,
 * utiliza metodos para trabalhar em cima das classes:
 * @see FuncionarioRepositorio
 * ,
 * @see RestauranteRepositorio
 * E
 * @see VotoRepositorio
 */

public class VotoController {

    private FuncionarioRepositorio funcionarioRepositorio;
    private RestauranteRepositorio restauranteRepositorio;
    private VotoRepositorio votoRepositorio;

    public VotoController(){
        this.funcionarioRepositorio = new FuncionarioRepositorio();
        this.restauranteRepositorio = new RestauranteRepositorio();
        this.votoRepositorio = new VotoRepositorio();
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepositorio.buscar();
    }

    public List<Restaurante> listarRestaurantes() {
        return restauranteRepositorio.buscar();
    }

    /**
     * Metodo
     * @return
     */
    public List<Apuracao> apurarVotos() {
        return votoRepositorio.buscarPorData(Calendar.getInstance());
    }

    /**
     * Medoto inserirVotacao que faz a inserção dos votos.
     * possui
     * @param nomeFuncionario
     * E
     * @param nomeRestaurante
     * para cadastrar quem votou e o local de votação,
     * se não existir o funcionario e nem o restaurante na tabela, ambos sao criados.
     * possui a exceção
     * @throws ErroExcecao
     * para retornar uma mensagem de erro.
     */
    public void inserirVotacao(String nomeFuncionario, String nomeRestaurante) throws  ErroExcecao {
        Restaurante restaurante = restauranteRepositorio.buscarPorNome(nomeRestaurante);

        if(restaurante == null) {
            restaurante = new Restaurante(nomeRestaurante);
        }

        Funcionario funcionario = funcionarioRepositorio.buscarNome(nomeFuncionario);

        if(funcionario == null){
            funcionario = new Funcionario(nomeFuncionario);

        } else {
            List<Voto> votos = votoRepositorio.buscar(funcionario, Calendar.getInstance());

            if (votos != null && !votos.isEmpty()){
                throw new ErroExcecao("Funcionario já votou hoje.");
            }
        }

        funcionario.add(new Voto(Calendar.getInstance(), restaurante));

        try {
            funcionarioRepositorio.inserir(funcionario);
        }catch (PersistenceException e) {
            throw new ErroExcecao("Falha ao inserir Dados da votação");
        }
    }

}

package br.org.fundatec.repository;

import br.org.fundatec.model.Funcionario;
import br.org.fundatec.model.Restaurante;

import javax.persistence.*;
import java.util.List;

/**
 * class RestauranteRepositorio,
 * utilizada para trabalhar em cima do DB.
 */
public class FuncionarioRepositorio {

    private EntityManager em;

    public FuncionarioRepositorio(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaVotos");
        em = factory.createEntityManager();
    }

    /**
     * @return
     * listar todos Funcionarios inseridos na tabela.
     */
    public List<Funcionario> buscar() {
        TypedQuery<Funcionario> buscarTodosQuery = this.em.createQuery("select e from Funcionario e", Funcionario.class);
        return buscarTodosQuery.getResultList();
    }

    /**
     * @param nome
     * busca na tabela um nome especifico,
     * return:
     * Lista todos os Funcionarios que possuirem tal nome.
     */
    public Funcionario buscarNome(String nome){
        TypedQuery<Funcionario> query = this.em.createQuery("select e from Funcionario e where e.nome like :nome", Funcionario.class);
        query.setParameter("nome", nome);

        try{
            return query.getSingleResult();
        }catch (NoResultException e) {
            return  null;
        }
    }

    /**
     * Metodo que insere um objeto
     * @param funcionario
     * No Banco de Dados fazendo update.
     */
    public void inserir(Funcionario funcionario) {
        this.em.getTransaction().begin();
        this.em.merge(funcionario);
        this.em.getTransaction().commit();
    }
}

package br.org.fundatec.repository;

import br.org.fundatec.model.Restaurante;
import javax.persistence.*;
import java.util.List;

/**
 * class RestauranteRepositorio,
 * utilizada para trabalhar em cima do DB.
 */

public class RestauranteRepositorio {

    private EntityManager em;

    public RestauranteRepositorio(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaVotos");
        em = factory.createEntityManager();
    }

    /**
     * @return
     * listar todos Restaurantes inseridos na tabela.
     */
    public List<Restaurante> buscar() {
        TypedQuery<Restaurante> buscarTodosQuery = this.em.createQuery("select e from Restaurante e", Restaurante.class);
        return buscarTodosQuery.getResultList();
    }

    /**
     * @param nome
     * busca na tabela um nome especifico,
     * @return
     * Lista todos os Restaurantes que possuirem tal nome.
     */
    public Restaurante buscarPorNome(String nome) {
        TypedQuery<Restaurante> query = this.em.createQuery("select e from Restaurante e where e.nome like :nome", Restaurante.class);
        query.setParameter("nome", nome);

        try{
            return query.getSingleResult();
        }catch (NoResultException e) {
            return  null;
        }

    }

}

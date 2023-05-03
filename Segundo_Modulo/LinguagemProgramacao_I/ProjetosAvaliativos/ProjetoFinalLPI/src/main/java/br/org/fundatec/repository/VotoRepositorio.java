package br.org.fundatec.repository;

import br.org.fundatec.model.Apuracao;
import br.org.fundatec.model.Funcionario;
import br.org.fundatec.model.Voto;
import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

/**
 * class VotoRepositorio,
 * utilizada para trabalhar em cima do DB.
 */

public class VotoRepositorio {

    private EntityManager em;

    public VotoRepositorio(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("SistemaVotos");
        em = factory.createEntityManager();
    }

    /**
     * @return
     * listar todos Votos inseridos na tabela.
     */
    public List<Voto> buscar(Funcionario funcionario, Calendar data) {
        TypedQuery<Voto> busca = this.em.createQuery("select e from Voto e where e.funcionario = :funcionario and e.data = :data", Voto.class);
        busca.setParameter("funcionario", funcionario);
        busca.setParameter("data", data, TemporalType.DATE);
        return busca.getResultList();
    }

    public List<Apuracao> buscarPorData(Calendar data){

        StringBuffer sb = new StringBuffer(50);
        sb.append("Select new br.org.fundatec.model.Apuracao(r.nome, COUNT(r.nome)) ");
        sb.append("From Voto e ");
        sb.append("inner join e.restaurante r ");
        sb.append("where e.data = :data group by r.nome");

        Query buscaData = this.em.createQuery(sb.toString(),Apuracao.class);
        buscaData.setParameter("data", data, TemporalType.DATE);
        return buscaData.getResultList();
    }
}

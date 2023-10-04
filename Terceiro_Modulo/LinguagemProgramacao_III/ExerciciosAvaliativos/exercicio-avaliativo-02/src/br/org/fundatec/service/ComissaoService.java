package br.org.fundatec.service;

import br.org.fundatec.model.Imovel;

import java.math.BigDecimal;

public class ComissaoService {

    /**
     *  Utilização da regra de clean code:
     *      Regra de nomes pronunciáveis e buscáveis
     */
    BigDecimal porcentagemComissao = BigDecimal.valueOf(6);

    /**
     *  Utilização da regra de clean code:
     *      Regra de métodos com nomes descritivos
     *      Regra de métodos Pequenos e com um objetivo
     *      Regra de design Utilizando injeção de dependência
     *      Regras sobre entendimento do código - Seja consistente
     *
     * @param imovel
     * @return comissao da venda;
     */
    public BigDecimal calcularComissaoVenda(Imovel imovel) {
        BigDecimal valorTotalImovel = imovel.getValorImovel();
        /** Calculo de comissão de venda que sera direcionado ao funcionario */
        BigDecimal comissaoVenda = valorTotalImovel.multiply(porcentagemComissao).divide(BigDecimal.valueOf(100));
        return comissaoVenda;
    }
}

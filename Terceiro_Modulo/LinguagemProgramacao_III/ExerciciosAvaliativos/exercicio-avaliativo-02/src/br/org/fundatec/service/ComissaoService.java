package br.org.fundatec.service;

import br.org.fundatec.model.Imovel;

import java.math.BigDecimal;

public class ComissaoService {

    BigDecimal porcentagemComissao = BigDecimal.valueOf(6);

    public BigDecimal calcularComissaoVenda(Imovel imovel) {
        BigDecimal valorTotalImovel = imovel.getValorImovel();
        // TODO Como calcular comissão de 6% com BigDecimal
        BigDecimal comissaoVenda = valorTotalImovel.multiply(porcentagemComissao).divide(BigDecimal.valueOf(100));
        return comissaoVenda;
    }


}

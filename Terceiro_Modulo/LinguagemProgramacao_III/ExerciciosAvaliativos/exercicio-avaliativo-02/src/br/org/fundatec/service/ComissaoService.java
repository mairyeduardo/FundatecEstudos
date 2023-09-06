package br.org.fundatec.service;

import br.org.fundatec.model.Imovel;

import java.math.BigDecimal;

public class ComissaoService {
    public BigDecimal calcularComissaoVenda(Imovel imovel) {
        BigDecimal valorTotalImovel = imovel.getValorImovel();
        // TODO Como calcular comissão de 6% com BigDecimal
        return BigDecimal.valueOf(0);
    }


}

package exercicioavaliativoextra.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Double somarNumeros(Double valorNumero1, Double valorNumero2) {

        Double resultadoDaSoma = (valorNumero1 + valorNumero2);
        return resultadoDaSoma;
    }


    public Double subtrairNumeros(Double valorNumero1, Double valorNumero2) {

        Double resultadoDaSubtracao = (valorNumero1 - valorNumero2);
        return resultadoDaSubtracao;
    }

    public Double multiplicarNumeros(Double valorNumero1, Double valorNumero2) {

        Double resultadoDaMultiplicacao = (valorNumero1 * valorNumero2);
        return resultadoDaMultiplicacao;
    }

    public Double dividirNumeros(Double valorNumero1, Double valorNumero2) {

        if (valorNumero2 == 0) {
            System.out.println("Impossivel realizar divisão por 0");
            return null;
        } else {
            Double resultadoDaDivisao = (valorNumero1 / valorNumero2);
            return resultadoDaDivisao;
        }
    }

    public Double calcularRaizQuadrada(Double valorNumero) {
        return Math.sqrt(valorNumero);
    }

    public Double calcularRaizCubica(Double valorNumero) {
        return Math.cbrt(valorNumero);
    }
}

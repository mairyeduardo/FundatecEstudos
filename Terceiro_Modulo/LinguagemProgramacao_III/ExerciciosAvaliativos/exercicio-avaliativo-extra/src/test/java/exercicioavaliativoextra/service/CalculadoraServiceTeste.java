package exercicioavaliativoextra.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTeste {

    private CalculadoraService calculadoraService;

    @Before
    public void init() {
        this.calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomarDoisNumerosEResultarEmCinquenta() {
        Double resultadoEsperado = 50.0;
        Double resultadoDaSoma = calculadoraService.somarNumeros(30.0, 20.0);
        assertEquals(resultadoEsperado, resultadoDaSoma);
    }

    @Test
    public void deveSubtrairDoisNumerosEResultarEmCinquenta() {
        Double resultadoEsperado = 50.0;
        Double resultadoSubtracao = calculadoraService.subtrairNumeros(70.0, 20.0);
        assertEquals(resultadoEsperado, resultadoSubtracao);
    }

    @Test
    public void deveMultiplicarDoisNumerosEResultarEmCinquenta() {
        Double resultadoEsperado = 50.0;
        Double resultadoMultiplicacao = calculadoraService.multiplicarNumeros(5.0, 10.0);
        assertEquals(resultadoEsperado, resultadoMultiplicacao);
    }

    @Test
    public void deveDividirDoisNumerosEResultarEmCinquenta() {
        Double resultadoEsperado = 50.0;
        Double resultadoDivisao = calculadoraService.dividirNumeros(200.0, 4.0);
        assertEquals(resultadoEsperado, resultadoDivisao);
    }

    @Test
    public void deveCalcularRaizQuadradaEResultarEmCinco() {
        Double resultadoEsperado = 5.0;
        Double resultadoRaizQuadrada = calculadoraService.calcularRaizQuadrada(25.0);
        assertEquals(resultadoEsperado, resultadoRaizQuadrada);
    }

    @Test
    public void deveCalcularRaizCubicaEResultarEmCinco() {
        Double resultadoEsperado = 5.0;
        Double resultadoRaizCubica = calculadoraService.calcularRaizCubica(125.0);
        assertEquals(resultadoEsperado, resultadoRaizCubica);
    }

}

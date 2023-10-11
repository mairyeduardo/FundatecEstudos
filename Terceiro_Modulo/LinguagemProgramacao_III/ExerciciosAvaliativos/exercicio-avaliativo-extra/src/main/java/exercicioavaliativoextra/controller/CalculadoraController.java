package exercicioavaliativoextra.controller;

import exercicioavaliativoextra.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calculadora")
public class CalculadoraController {

    private CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/somar/{valorNumero1}/{valorNumero2}")
    public ResponseEntity<String> somarNumeros(@PathVariable("valorNumero1") Double valorNumero1,
                                                         @PathVariable("valorNumero2") Double valorNumero2) {

        Double resultadoDaSoma = calculadoraService.somarNumeros(valorNumero1, valorNumero2);
        return ResponseEntity.ok("Resultado da Soma = " + resultadoDaSoma);
    }

    @GetMapping("/subtrair/{valorNumero1}/{valorNumero2}")
    public ResponseEntity<String> subtrairNumeros(@PathVariable("valorNumero1") Double valorNumero1,
                                                            @PathVariable("valorNumero2") Double valorNumero2) {

        Double resultadoDaSubtracao = calculadoraService.subtrairNumeros(valorNumero1, valorNumero2);
        return ResponseEntity.ok("Resultado da Subtração = " + resultadoDaSubtracao);
    }

    @GetMapping("/multiplicar/{valorNumero1}/{valorNumero2}")
    public ResponseEntity<String> multiplicarNumeros(@PathVariable("valorNumero1") Double valorNumero1,
                                                               @PathVariable("valorNumero2") Double valorNumero2) {

        Double resultadoDaMultiplicao = calculadoraService.multiplicarNumeros(valorNumero1, valorNumero2);
        return ResponseEntity.ok("Resultado da Multiplicação = " + resultadoDaMultiplicao);
    }

    @GetMapping("/dividir/{valorNumero1}/{valorNumero2}")
    public ResponseEntity<String> dividirNumeros(@PathVariable("valorNumero1") Double valorNumero1,
                                                           @PathVariable("valorNumero2") Double valorNumero2) {

        Double resultadoDaDivisao = calculadoraService.dividirNumeros(valorNumero1, valorNumero2);
        if (resultadoDaDivisao == null) {
            return ResponseEntity.ok("Não é possivel realizar divisão por 0");
        } else {
            return ResponseEntity.ok("Resultado da divisão = " + resultadoDaDivisao);
        }
    }

    @GetMapping("/raizQuadrada/{valorNumero}")
    public ResponseEntity<String> calcularRaizQuadrada(@PathVariable("valorNumero") Double valorNumero) {

        Double resultadoDaRaizQuadrada = calculadoraService.calcularRaizQuadrada(valorNumero);
        return ResponseEntity.ok("Resultado da raiz quadrada = " + resultadoDaRaizQuadrada);
    }

    @GetMapping("/raizCubica/{valorNumero}")
    public ResponseEntity<String> calcularRaizCubica(@PathVariable("valorNumero") Double valorNumero) {

        Double resultadoDaRaizCubica = calculadoraService.calcularRaizCubica(valorNumero);
        return ResponseEntity.ok("Resultado da raiz cubica = " + resultadoDaRaizCubica);
    }

}

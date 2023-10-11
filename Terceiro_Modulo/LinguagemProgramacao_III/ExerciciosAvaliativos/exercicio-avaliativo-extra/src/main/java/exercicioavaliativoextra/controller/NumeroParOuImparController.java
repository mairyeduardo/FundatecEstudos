package exercicioavaliativoextra.controller;

import exercicioavaliativoextra.service.NumeroParOuImparService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/parOuImpar")
public class NumeroParOuImparController {

    NumeroParOuImparService numeroParOuImparService;

    NumeroParOuImparController(NumeroParOuImparService numeroParOuImparService){
        this.numeroParOuImparService = numeroParOuImparService;
    }
    @GetMapping("/{valorNumero}")
    public ResponseEntity<String> VerificiarSeNumeroParOuImpar(@PathVariable("valorNumero") int valorNumero) {

        boolean resultadoDaVerificacao = numeroParOuImparService.VerificarSeNumeroPar(valorNumero);
        if (resultadoDaVerificacao) {
            return ResponseEntity.ok("Numero = " + valorNumero + " é par!");
        } else {
            return ResponseEntity.ok("Numero = " + valorNumero + " é impar!");
        }
    }

}

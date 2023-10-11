package exercicioavaliativoextra.controller;


import exercicioavaliativoextra.service.NumeroPrimoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/primo")
public class NumeroPrimoController {

    NumeroPrimoService numeroPrimoService;

    NumeroPrimoController(NumeroPrimoService numeroPrimoService){
        this.numeroPrimoService = numeroPrimoService;
    }
    @GetMapping("/{valorNumero}")
    public ResponseEntity<String> VerificarSeNumeroPrimo(@PathVariable("valorNumero") Integer valorNumero) {

        boolean resultadoDaVerificacao = numeroPrimoService.VerificarSeNumeroPrimo(valorNumero);
        if (resultadoDaVerificacao) {
            return ResponseEntity.ok("Numero informado é primo");
        } else {
            return ResponseEntity.ok("Numero informado não é primo");
        }
    }
}

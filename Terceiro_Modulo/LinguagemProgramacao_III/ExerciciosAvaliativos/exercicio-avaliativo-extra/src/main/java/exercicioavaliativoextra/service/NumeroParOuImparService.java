package exercicioavaliativoextra.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroParOuImparService {

    public boolean VerificarSeNumeroPar(int valorNumero) {

        if (valorNumero % 2 == 0) {
            System.out.println("Numero = " + valorNumero + " é par!");
            return true;
        } else {
            System.out.println("Numero = " + valorNumero + " é impar!");
            return false;
        }

    }
}

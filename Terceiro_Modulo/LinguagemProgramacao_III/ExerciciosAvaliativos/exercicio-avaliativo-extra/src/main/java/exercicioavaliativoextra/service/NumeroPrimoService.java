package exercicioavaliativoextra.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroPrimoService {

    public boolean VerificarSeNumeroPrimo(Integer valorNumero) {

        if (valorNumero == 1) {
            return false;
        } else {
            for (int i = 2; i < valorNumero; i++) {
                if (valorNumero % i == 0)
                    return false;
            }
            return true;
        }
    }
}

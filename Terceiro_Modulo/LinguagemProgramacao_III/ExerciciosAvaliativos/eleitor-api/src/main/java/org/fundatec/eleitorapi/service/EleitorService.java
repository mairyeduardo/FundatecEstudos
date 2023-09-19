package org.fundatec.eleitorapi.service;


import org.springframework.stereotype.Service;

@Service
public class EleitorService {

    public String verificarVoto(int idadePessoa, boolean isAlfabetizado) {
        if (isAlfabetizado) {
            return verificarVotoSeEleitorAlfabetizado(idadePessoa);
        } else {
            return verificarVotoSeEleitorNaoAlfabetizado(idadePessoa);
        }
    }

    private String verificarVotoSeEleitorNaoAlfabetizado(int idadePessoa) {
        if (idadePessoa >= 16) {
            return "Voto Opcional";
        } else {
            return "Voto Proibido";
        }
    }

    private String verificarVotoSeEleitorAlfabetizado(int idadePessoa) {
        if ((idadePessoa >= 16 && idadePessoa < 18) || idadePessoa > 70) {
            return "Voto Opcional";
        } else if (idadePessoa >= 18 && idadePessoa < 70) {
            return "Voto Obrigatorio";
        } else {
            return "Voto Proibido";
        }
    }


}

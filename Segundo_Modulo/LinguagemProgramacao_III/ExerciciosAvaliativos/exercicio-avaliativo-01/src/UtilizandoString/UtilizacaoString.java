package UtilizandoString;

public class UtilizacaoString {

    public String aumentarNome(String nome) {
        String UpperCase = nome.toUpperCase();
        return UpperCase;
    }

    public String diminuirNome(String nome) {
        String LowerCase = nome.toLowerCase();
        return LowerCase;
    }

    public Integer qntCaracteres(String nome) {
        Integer Quantidade = nome.length();
        return Quantidade;
    }

    public String concatenarIIIAoNome(String nome) {
        String conc = nome.concat("III");
        return conc;
    }

    public String repetirNome3Vezes(String nome) {
        String repetidos = nome.repeat(3);
        return repetidos;
    }

    public String trocarLetraAPorZ(String nome) {
        String troca = nome.replace("a", "Z");
        return troca;
    }

    public String trocarPedroPorJordan(String nome) {
        String te = nome.replaceAll("Pedro", "Jordan");
        return te;
    }

    public Boolean verificarLetraB(String nome) {
        Boolean verificarLetra = nome.contains("b");
        return verificarLetra;
    }

    public Boolean ultimaLetra(String nome) {
        Boolean ultimaLetra = nome.endsWith("l");
        return ultimaLetra;
    }

    public Boolean primeiraLetra(String nome) {
        Boolean primeiraLetra = nome.startsWith("P");
        return primeiraLetra;
    }

    public Boolean verificarSeNomeVazio(String nome) {
        Boolean vazio = nome.isEmpty();
        return vazio;
    }

    public String[] separarString(String nome) {
        String[] Separar = nome.split(" ");
        return Separar;
    }
}

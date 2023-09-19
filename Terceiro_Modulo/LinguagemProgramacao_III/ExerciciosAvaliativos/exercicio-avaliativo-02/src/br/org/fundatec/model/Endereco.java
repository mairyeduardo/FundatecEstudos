package br.org.fundatec.model;

//TODO Criar Builder
public class Endereco {

    private Long idEndereco;
    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;

    private Endereco(EnderecoBuilder builder) {
        this.idEndereco = builder.idEndereco;
        this.cep = builder.cep;
        this.rua = builder.rua;
        this.numero = builder.numero;
        this.bairro = builder.bairro;
        this.complemento = builder.complemento;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public static EnderecoBuilder builder() {
        return new EnderecoBuilder();
    }

    public static class EnderecoBuilder {

        private Long idEndereco;
        private String cep;
        private String rua;
        private int numero;
        private String bairro;
        private String complemento;

        private EnderecoBuilder() {
        }

        public EnderecoBuilder idEndereco(Long idEndereco) {
            this.idEndereco = idEndereco;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public EnderecoBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }
}



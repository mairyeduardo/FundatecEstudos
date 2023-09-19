package br.org.fundatec.view;

import br.org.fundatec.model.*;
import br.org.fundatec.service.ImobiliariaService;
import br.org.fundatec.service.VendaService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Imobiliaria imobiliaria1 = new Imobiliaria(1L, "auxiliadoraPredial");

        /** Endereco de clientes e funcionarios **/
        Endereco endereco1 = Endereco.builder()
                .idEndereco(1L).cep("11111-111").rua("Rua teste1").numero(100).bairro("Bairro1").complemento("casa1").build();
        Endereco endereco2 = Endereco.builder()
                .idEndereco(2L).cep("22222-222").rua("Rua teste2").numero(200).bairro("Bairro2").complemento("casa2").build();
        Endereco endereco3 = Endereco.builder()
                .idEndereco(3L).cep("33333-333").rua("Rua teste3").numero(300).bairro("Bairro3").complemento("casa3").build();
        Endereco endereco4 = Endereco.builder()
                .idEndereco(4L).cep("44444-444").rua("Rua teste4").numero(400).bairro("Bairro4").complemento("casa4").build();
        Endereco endereco5 = Endereco.builder()
                .idEndereco(5L).cep("55555-555").rua("Rua teste5").numero(500).bairro("Bairro5").complemento("casa5").build();

        /** Endereco dos imoveis a venda **/
        Endereco endereco8 = Endereco.builder()
                .idEndereco(8L).cep("88888-888").rua("Rua teste8").numero(800).bairro("Bairro8").complemento("casa8").build();
        Endereco endereco9 = Endereco.builder()
                .idEndereco(9L).cep("99999-999").rua("Rua teste9").numero(900).bairro("Bairro9").complemento("apartamento9").build();
        Endereco endereco10 = Endereco.builder()
                .idEndereco(10L).cep("10101-010").rua("Rua teste10").numero(1000).bairro("Bairro10").complemento("terreno10").build();

        Cliente cliente1 = new Cliente(1L, "MarcioCliente", endereco1, "111.111.111-11", 1L, TipoCliente.COMUM, BigDecimal.valueOf(1200));
        Cliente cliente2 = new Cliente(2L, "CaioCliente", endereco2, "222.222.222-22", 2L, TipoCliente.VIP, BigDecimal.valueOf(1600));
        Cliente cliente3 = new Cliente(3L, "JorgeCorretor", endereco3, "777.777.777-77", 3L, TipoCliente.FUNCIONARIO, BigDecimal.valueOf(3200));

        Funcionario funcionario1 = new Funcionario(3L, "JorgeCorretor", endereco3, "777.777.777-77", 1L, BigDecimal.valueOf(3200), TipoFuncionario.CORRETOR, imobiliaria1);
        Funcionario funcionario2 = new Funcionario(4L, "FabioAtendente", endereco4, "888.888.888-88", 2L, BigDecimal.valueOf(1500), TipoFuncionario.ATENDENTE, imobiliaria1);
        Funcionario funcionario3 = new Funcionario(5L, "NaldoAdvogado", endereco5, "999.999.999-99", 3L, BigDecimal.valueOf(1500), TipoFuncionario.ADVOGADOIMOBILIARIO, imobiliaria1);

        Imovel imovel1 = new Imovel(1L, BigDecimal.valueOf(200520), "Casa 3 quartos", endereco8, TipoImovel.CASA, imobiliaria1);
        Imovel imovel2 = new Imovel(2L, BigDecimal.valueOf(120402), "Apartamento 2 quartos", endereco9, TipoImovel.APARTAMENTO, imobiliaria1);
        Imovel imovel3 = new Imovel(3L, BigDecimal.valueOf(80100), "Terreno Limpo", endereco10, TipoImovel.TERRENO, imobiliaria1);


        ImobiliariaService imobiliariaService = new ImobiliariaService();
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario1);
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario2);
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario3);
        imobiliariaService.vincularCliente(imobiliaria1, cliente1);
        imobiliariaService.vincularCliente(imobiliaria1, cliente2);
        imobiliariaService.vincularCliente(imobiliaria1, cliente3);
        imobiliariaService.vincularImovel(imobiliaria1, imovel1);
        imobiliariaService.vincularImovel(imobiliaria1, imovel2);
        imobiliariaService.vincularImovel(imobiliaria1, imovel3);

        for (Funcionario f : imobiliaria1.getFuncionarios()) {
            System.out.println("@ Funcionario da Imobiliaria " + imobiliaria1.getNomeImobiliaria() +
                    ", nome: " + f.getNome());
        }

        for (Cliente c : imobiliaria1.getClientes()) {
            System.out.println("@ Cliente da imobiliaria" + imobiliaria1.getNomeImobiliaria() +
                    ", nome: " + c.getNome());
        }

        for (Imovel i : imobiliaria1.getImoveis()) {
            System.out.println("@ Imovel da imobiliaria" + imobiliaria1.getNomeImobiliaria() +
                    ", nome: " + i.getDescricao());
        }

        VendaService vendaService = new VendaService();
        vendaService.venderImovel(funcionario1, cliente3, imovel1, imobiliaria1);
        vendaService.venderImovel(funcionario2, cliente2, imovel2, imobiliaria1);
        vendaService.venderImovel(funcionario3, cliente1, imovel3, imobiliaria1);
    }
}
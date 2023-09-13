package br.org.fundatec.view;

import br.org.fundatec.model.*;
import br.org.fundatec.service.ImobiliariaService;
import br.org.fundatec.service.VendaService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Imobiliaria imobiliaria1 = new Imobiliaria(1L, "auxiliadoraPredial");

        // Endereco de clientes e funcionarios
        Endereco endereco1 = new Endereco(1L, "11111-111", "Rua teste1", 100, "Bairro1", "casa1");
        Endereco endereco2 = new Endereco(2L, "22222-222", "Rua teste2", 200, "Bairro2", "casa2");
        Endereco endereco3 = new Endereco(3L, "33333-333", "Rua teste3", 300, "Bairro3", "casa3");
        Endereco endereco4 = new Endereco(4L, "44444-444", "Rua teste4", 400, "Bairro4", "casa4");
        Endereco endereco5 = new Endereco(5L, "55555-555", "Rua teste5", 500, "Bairro5", "casa5");

        // Endereco dos imoveis a venda
        Endereco endereco8 = new Endereco(8L, "88888-888", "Rua teste8", 800, "Bairro8", "casa8");
        Endereco endereco9 = new Endereco(9L, "99999-999", "Rua teste9", 900, "Bairro9", "apartamento9");
        Endereco endereco10 = new Endereco(10L, "10101-010", "Rua teste10", 1000, "Bairro10", "terreno10");

        Cliente cliente1 = new Cliente(1L,"MarcioCliente", endereco1, "111.111.111-11", 1L, TipoCliente.COMUM, BigDecimal.valueOf(1200));
        Cliente cliente2 = new Cliente(2L,"CaioCliente", endereco2, "222.222.222-22", 2L, TipoCliente.VIP, BigDecimal.valueOf(1600));
        Cliente cliente3 = new Cliente(3L,"JorgeCorretor", endereco3, "777.777.777-77", 3L, TipoCliente.FUNCIONARIO, BigDecimal.valueOf(3200));

        Funcionario funcionario1 = new Funcionario(3L, "JorgeCorretor", endereco3, "777.777.777-77", 1L, BigDecimal.valueOf(3200), TipoFuncionario.CORRETOR, imobiliaria1 );
        Funcionario funcionario2 = new Funcionario(4L, "FabioAtendente", endereco4, "888.888.888-88", 2L, BigDecimal.valueOf(1500), TipoFuncionario.ATENDENTE, imobiliaria1);
        Funcionario funcionario3 = new Funcionario(5L, "NaldoAdvogado", endereco5, "999.999.999-99", 3L, BigDecimal.valueOf(1500), TipoFuncionario.ADVOGADOIMOBILIARIO, imobiliaria1);

        ImobiliariaService imobiliariaService = new ImobiliariaService();
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario1);
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario2);
        imobiliariaService.vincularFuncionario(imobiliaria1, funcionario3);

        for (Funcionario f : imobiliaria1.getFuncionarios()) {
            System.out.println("@ Funcionario da Imobiliaria " + imobiliaria1.getNomeImobiliaria() +
                    " :" + f.getNome());
        }

        Imovel imovel1 = new Imovel(1L, BigDecimal.valueOf(200520), endereco8, TipoImovel.CASA, imobiliaria1);
        Imovel imovel2 = new Imovel(2L, BigDecimal.valueOf(120402), endereco9, TipoImovel.APARTAMENTO, imobiliaria1);
        Imovel imovel3 = new Imovel(3L, BigDecimal.valueOf(80100), endereco10, TipoImovel.TERRENO, imobiliaria1);



        VendaService vendaService = new VendaService();

        // funcionario e cliente são iguais; fazer validacao??
        vendaService.venderImovel(funcionario1, cliente3, imovel1);
        vendaService.venderImovel(funcionario2, cliente2, imovel2);
        vendaService.venderImovel(funcionario3, cliente1, imovel3);
    }
}
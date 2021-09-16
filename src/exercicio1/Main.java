package exercicio1;

import exercicio1.model.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", "Rua 13", "2121-2121", 24, 1.70);
        Pessoa p2 = new Pessoa("Margarida", "Rua 7", "3232-3232", 29, 1.65);
        Pessoa p3 = new Pessoa("Josefa", "Rua 7", "3232-3232", 32, 1.65);
        Pessoa p4 = new Pessoa("Marcelo", "Rua Bela", "3232-3232", 33, 1.85);
        Pessoa p5 = new Pessoa("Josefa", "Rua Quartzo", "3232-3232", 37, 1.75);
        Pessoa p6 = new Pessoa("Benedito", "Rua Infinita", "3232-3232", 39, 1.65);
        Pessoa p7 = new Pessoa("Joice", "Rua 7", "3232-3232", 66, 1.65);
        Pessoa p8 = new Pessoa("Priscila", "Rua Zebra", "3232-3232", 12, 1.35);
        Pessoa p9 = new Pessoa("Tania", "Rua Flor", "3232-3232", 7, 1.15);
        Pessoa p10 = new Pessoa("Maria", "Rua Dez", "3232-3232", 32, 1.65);

        List<Pessoa> listaPessoa = new ArrayList<>();

        Agenda agenda = new Agenda(listaPessoa);

       //  adicionando pessoas na lista
        agenda.armazenarPessoa(p1);
        agenda.armazenarPessoa(p2);
        agenda.armazenarPessoa(p3);
        agenda.armazenarPessoa(p4);
        agenda.armazenarPessoa(p5);
        agenda.armazenarPessoa(p6);
        agenda.armazenarPessoa(p7);
        agenda.armazenarPessoa(p8);
        agenda.armazenarPessoa(p9);
        agenda.armazenarPessoa(p10);

        System.out.println("\n----------------- Buscar pessoa com nome Maria -----------------");
        agenda.buscarPessoa("Maria");

        System.out.println("\n----------------- Exibir toda agenda -----------------");
        agenda.exibirTodaAgenda();

        System.out.println("\n----------------- Exibir pessoa no index 2 -----------------");
        agenda.exibirPessoa(2);

        System.out.println("\n----------------- Remover pessoa com nome Joice -----------------");
        agenda.removerPessoa("Joice");

        System.out.println("\n----------------- Exibir lista pelo nome com ordem alfabética -----------------");
        agenda.listarPessoasEmOrdemAlfabeticaPorNome();

        System.out.println("\n----------------- Exibir lista pelo endereço com ordem alfabética -----------------");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

        System.out.println("\n----------------- Exibir lista por ordem descrescente da idade -----------------");
        agenda.listarPessoasPorIdade();
    }
}

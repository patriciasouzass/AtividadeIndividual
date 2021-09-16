package exercicio1.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {

    public Agenda(List<Pessoa> listadePessoas) {
        this.listadePessoas = listadePessoas;
    }

    private List<Pessoa> listadePessoas; 
    
    public void armazenarPessoa(Pessoa pessoa) {
        listadePessoas.add(pessoa);
    }

    public void removerPessoa(String nome){
        Pessoa p = listadePessoas.stream()
                .filter(pegarNome -> pegarNome.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .get();
        listadePessoas.remove(p);
    }

    public void buscarPessoa(String nome){
        listadePessoas.stream()
                .filter(pegarNome -> pegarNome.getNome().equalsIgnoreCase(nome))
                .forEach(System.out::println);
    }

    public void exibirTodaAgenda(){
        for (Pessoa todaAgenda : listadePessoas){
            System.out.println(todaAgenda);
        }

    }

    public void exibirPessoa(int index){
        System.out.println(listadePessoas.get(index));
    }

    public void listarPessoasEmOrdemAlfabeticaPorNome(){
        listadePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void listarPessoasEmOrdemAlfabeticaDeEndereco(){
        listadePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getEndereco))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void listarPessoasPorIdade(){
        listadePessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    public List<Pessoa> getListadePessoas() {
        return listadePessoas;
    }

    public void setListadePessoas(List<Pessoa> listadePessoas) {
        this.listadePessoas = listadePessoas;
    }
}

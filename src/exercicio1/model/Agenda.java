package exercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> listadePessoas = new ArrayList();

    public void armazenarPessoa(Pessoa pessoa) {
        listadePessoas.add(pessoa);
    }

    public void removerPessoa(String nome){
        this.listadePessoas.remove(nome);
    }

    public Pessoa buscarPessoa(String nome){
        for (int i = 0; i<listadePessoas.size(); i++){
            Pessoa pessoa = listadePessoas.get(i);
            if (pessoa.getNome().equalsIgnoreCase(nome))
                return listadePessoas.get(i);
        }
        return null;
    }

    public void exibirTodaAgenda(){
        for (Pessoa todaAgenda : listadePessoas){
            System.out.println(todaAgenda);
        }

    }

    public void exibirPessoa(int index){
        System.out.println(listadePessoas.get(index));
    }

}

package exercicio5;

import exercicio5.model.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome, cpf, endereco, email, telefone;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.next();
        System.out.println("Digite seu CPF: ");
        cpf = input.next();
        System.out.println("Digite seu endereco: ");
        endereco = input.next();
        System.out.println("Digite seu e-mail: ");
        email = input.next();
        System.out.println("Digite seu telefone: ");
        telefone = input.next();

        Cliente cliente = new Cliente(nome, cpf, endereco, email, telefone);

        System.out.println("\n......::::: VALIDANDO INFORMAÇÕES :::::......");
        cliente.validarCliente();
    }
}

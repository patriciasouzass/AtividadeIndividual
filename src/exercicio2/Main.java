package exercicio2;

import exercicio2.model.ManipulaStrings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ManipulaStrings manipula = new ManipulaStrings();

        Scanner input = new Scanner(System.in);

        String nome;
        System.out.print("Digite o seu nome: ");
        nome = input.next();
        manipula.inverteString(nome);

        String testePalindromo;
        System.out.print("Digite uma palavra: ");
        testePalindromo = input.next();
        manipula.palindromo(testePalindromo);
    }


}

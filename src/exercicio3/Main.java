package exercicio3;

import exercicio3.model.Retangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do lado a: ");
        double ladoA = input.nextDouble();
        System.out.print("Digite o valor do lado b: ");
        double ladoB = input.nextDouble();
        Retangulo.calculaArea(ladoA, ladoB);

    }
}

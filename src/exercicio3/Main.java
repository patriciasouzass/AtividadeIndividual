package exercicio3;

import exercicio3.model.Retangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n------------- CALCULAR ÁREA -------------");
        Retangulo.calculaArea(5, 7);

        System.out.println("\n------------- CALCULAR PERÍMETRO -------------");
        Retangulo.calculaPerimetro(4, 6.2);

        System.out.println("\n------------- QUANTIDADE DE PISO -------------");
        Retangulo.quantidadePiso(13, 420);

        System.out.println("\n------------- QUANTIDADE DE LAJOTA PARA RODAPÉ -------------");
        Retangulo.quantidadeRodape(13, 350);
    }
}

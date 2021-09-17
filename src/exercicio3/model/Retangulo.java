package exercicio3.model;

public class Retangulo {

    public static void calculaArea(double ladoA, double ladoB){
        double area = ladoA*ladoB;
        System.out.println("A área do retangulo é " + area);
    }

    public static void calculaPerimetro(double ladoA, double ladoB){
        double perimetro = 2 * (ladoA + ladoB);
        System.out.println("O perímetro do retangulo é " + perimetro);
    }

    public static void quantidadePiso(double areaLajota, double areaTotal){
        double qtdPiso = areaTotal/areaLajota;
        System.out.println("Quantidade de piso necessária é " + Math.ceil(qtdPiso));
    }
   }

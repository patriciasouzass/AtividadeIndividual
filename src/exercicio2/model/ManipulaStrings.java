package exercicio2.model;

import java.util.Locale;

public class ManipulaStrings {

    public static void inverteString(String nome){

        String invertido = "";
        for (int i = nome.toCharArray().length-1; i>=0;i--){
            invertido += nome.toCharArray()[i];
        }
        System.out.println(invertido.toUpperCase());
    }

    public void palindromo(String frase) {
        String semEspaco = frase.replace(" ", "").toLowerCase(Locale.ROOT);
        int i = 0;
        while (i < semEspaco.length()) {
            if (semEspaco.charAt(i) != semEspaco.charAt(semEspaco.length() - i -1)) {
                System.out.println("Não é um palíndromo.");
                System.exit(0);
            }
            i++;
        }
        System.out.println("É um palíndromo");
    }


}

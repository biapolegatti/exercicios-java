package basicos;

import java.util.Scanner;

public class ImprimeMaiscula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra;

        System.out.println("Informe a palavra que você deseja ver convertida: ");

        palavra = entrada.next().toUpperCase();
        System.out.println("Imprimindo em maiúsculo: " + palavra);



        palavra = palavra.toLowerCase();
        System.out.println("Imprimindo em minúsculo: " + palavra);


    }
}

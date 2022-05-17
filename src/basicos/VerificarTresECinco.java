package basicos;

import java.util.Scanner;

public class VerificarTresECinco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero % 3 == 0) {
            System.out.println("O numero " + numero + " é divisivel apenas por 3!");
        }


        if (numero % 5 == 0) {
            System.out.println("O numero " + numero + " é divisivel apenas por 5!");
        }

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O numero " + numero + " é divisivel por 3 e por 5!");
        }

    }

}

/*

    Escreva um programa Java para imprimir números que são divisíveis por 3, 5 e por ambos.

*/

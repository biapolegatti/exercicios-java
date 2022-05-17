package basicos;

import java.util.Scanner;

public class VerificarParOuImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero % 2 == 1) {
            System.out.println("O numero " + numero + " é impar!");
        } else
            System.out.println("O numero " + numero + " é par!");

    }

}

/*    Escreva um programa Java para aceitar um número e verifique se o número é par ou não. Imprime 1 se o número for par ou 0 se o número for ímpar. */


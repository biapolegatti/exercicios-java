package basicos;

import java.util.Scanner;

public class SomaBinario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu primeiro número binário: ");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Informe seu segundo número binário: ");
        int segundoNumero = entrada.nextInt();


        String binariaPrimeiro = Integer.toBinaryString(primeiroNumero);
        String binariaSegundo = Integer.toBinaryString(segundoNumero);

        String soma = binariaPrimeiro + binariaSegundo;

        System.out.println("A soma dos dois números binários é: " + soma);

    }
}


/*
    Escreva um programa Java para somar dois números binários.
    Dados de entrada:
        Insira o primeiro número binário: 10
        Insira o segundo número binário: 11
        Saída esperada
        Soma de dois números binários: 101
*/

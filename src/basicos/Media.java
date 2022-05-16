package basicos;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qntNumeros;
        double numero = 0;

        System.out.println("Informe quantos números você quer calcular a média: ");
        qntNumeros = entrada.nextInt();

        for (int contador = 1; contador <= qntNumeros; contador++) {
            System.out.println("Informe seu número: ");
            numero += entrada.nextInt();

        }

        double media = numero / qntNumeros;
        System.out.println("A media dos números é: " + media);

        entrada.close();

    }
}

    /*Escreva um programa Java que receba X números como entrada para calcular e imprimir a média dos números*/
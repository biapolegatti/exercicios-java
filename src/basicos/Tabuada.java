package basicos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int numero = entrada.nextInt();

        for (int contador = 0; contador <= 10; contador++) {

            System.out.println(numero + " x " + contador + " = " + numero * contador);
        }

    entrada.close();

    }


}

/*    Escreva um programa Java que receba um número como entrada e imprima sua tabela de multiplicação até 10.
        Dados de teste:
        Insira um número: 8
        Saída esperada:
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/

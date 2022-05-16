package basicos;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Informe o segundo número: ");
        int segundoNumero = entrada.nextInt();

        int divisao = primeiroNumero / segundoNumero;

        System.out.println("A divisão de " + primeiroNumero + " por " + segundoNumero + " é " + divisao);

        entrada.close();

    }

}

    /*Escreva um programa Java para dividir dois números e imprima na tela. Vá para o editor
        Dados de teste:
        50/3
        Saída esperada:
        16*/

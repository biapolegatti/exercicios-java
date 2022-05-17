package basicos;

import java.util.Scanner;

public class SomaDigitos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Informe o número inteiro que você deseja somar os dígitos: ");
        numero = entrada.nextInt();

        System.out.println("A soma dos algarismos é: " + somaAlgarismos(numero));

    }

    public static int somaAlgarismos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

}

  /*  Escreva um programa Java e calcule a soma dos dígitos de um inteiro.
        Dados de entrada:
        Insira um número inteiro: 25
        Saída esperada

        A soma dos algarismos é: 7
 */

package basicos;

import java.util.Scanner;

public class SomaInteirosTrue {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;

        System.out.println("Informe o primeiro inteiro");
        primeiroNumero = entrada.nextInt();
        System.out.println("Informe o segundo inteiro");
        segundoNumero = entrada.nextInt();
        System.out.println("Informe o terceiro inteiro");
        terceiroNumero = entrada.nextInt();


        int soma = primeiroNumero + segundoNumero;

        System.out.println("O primeiro número foi: " + primeiroNumero);
        System.out.println("O segundo número foi: " + segundoNumero);

        if (soma == terceiroNumero) {
            System.out.println("O resultado é verdadeiro!");
        } else System.out.println("O resultado é falso!");

    }
}

 /*   Escreva um programa Java para calcular a soma de dois inteiros e retornar true se a soma for igual a um terceiro inteiro.
        Digite o primeiro número: 5
        Insira o segundo número: 10
        Insira o terceiro número: 15
        O resultado é: verdade*/

//teria que ter feito usando método boolean, já que é o boolean que dá retorno verdadeiro ou falso, mas fiz com boolean na classe SomaDoisInteiros.

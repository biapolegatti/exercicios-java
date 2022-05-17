package basicos;

import java.util.Scanner;

public class SomaDoisInteiros {

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

        System.out.print("O resultado é: " + somarInteiros(primeiroNumero, segundoNumero, terceiroNumero));

    }

    public static boolean somarInteiros(int a, int b, int c) {
        return ((b > a && c > a));
    }


}

  /*  Escreva um programa Java que aceite três inteiros do usuário e retorne true se o segundo número for maior que o primeiro número e
   o terceiro número for maior que o segundo número.
   Se "abc" for verdadeiro, o segundo número não precisa ser maior que o primeiro. Vá para a saída de amostra do editor:

        Digite o primeiro número: 5
        Insira o segundo número: 10
        Insira o terceiro número: 15
        O resultado é: verdade
*/
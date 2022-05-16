package basicos;

import java.util.Scanner;

public class MultiplasFuncoes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int primeiroNumero = entrada.nextInt();


        System.out.println("Informe o segundo número: ");
        int segundoNumero = entrada.nextInt();

        int somar = primeiroNumero + segundoNumero;
        int subtrair = primeiroNumero - segundoNumero;
        int multiplicar = primeiroNumero * segundoNumero;
        int dividir = primeiroNumero / segundoNumero;
        int mod = primeiroNumero % segundoNumero;

        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + somar);
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtrair);
        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multiplicar);
        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + dividir);
        System.out.println(primeiroNumero + " % " + segundoNumero + " = " + mod);

        entrada.close();

    }

}


  /*  Escreva um programa Java para imprimir a soma, multiplicar, subtrair, dividir e o resto de dois números.
        Dados de teste:
        Insira o primeiro número: 125
        Insira o segundo número: 24
        Saída esperada:
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
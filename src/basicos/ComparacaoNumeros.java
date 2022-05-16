package basicos;

import java.util.Scanner;

public class ComparacaoNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.println("Informe seu primeiro número inteiro: ");
        primeiroNumero = entrada.nextInt();

        System.out.println("Informe seu segundo número inteiro: ");
        segundoNumero = entrada.nextInt();


        if(primeiroNumero == segundoNumero) {
            System.out.println(primeiroNumero + " == " + segundoNumero);
        }

        if(primeiroNumero != segundoNumero) {
            System.out.println(primeiroNumero + " != " + segundoNumero);
        }

        if (primeiroNumero < segundoNumero) {
            System.out.println(primeiroNumero + " < " + segundoNumero);

        }

        if (primeiroNumero <= segundoNumero) {
            System.out.println(primeiroNumero + " <= " + segundoNumero);
            }

        if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " > " + segundoNumero);
            }

        if (primeiroNumero >= segundoNumero) {
            System.out.println(primeiroNumero + " >= " + segundoNumero);
            }

    }
}

    /*Escreva um programa Java para comparar dois números.
        Dados de entrada:
        Insira o primeiro inteiro: 25
        Insira o segundo inteiro: 39
        Saída esperada
        25 != 39
        25 < 39
        25 <= 39*/

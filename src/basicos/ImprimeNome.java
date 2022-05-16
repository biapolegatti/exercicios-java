package basicos;

import java.util.Scanner;

public class ImprimeNome {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu primeiro nome: ");
        String primeiroNome = entrada.next();
        System.out.println("Informe seu segundo nome: ");
        String segundoNome = entrada.next();

        System.out.println("Olá \n" + primeiroNome + " " + segundoNome);

        entrada.close();

    }

}


 /*   Escreva um programa Java para imprimir 'Hello' na tela e depois imprima seu nome em uma linha separada.
        Saída esperada:
        Olá
        Alexandra Silva*/
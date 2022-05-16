package basicos;

import java.util.Scanner;

public class ReverteString {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.next();

        System.out.println("Imprimindo normal: " + frase);
        StringBuilder a = new StringBuilder(frase);
        frase = a.reverse().toString();

        System.out.println("Imprimindo reverse: " + frase);

    }
}


//A classe StringBuilder permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.




 /*   Escreva um programa Java para reverter uma string.
        Dados de entrada:
        Insira uma string: The quick brown fox
        Saída esperada
        Cadeia reversa: xof nworb kciuq ehT*/
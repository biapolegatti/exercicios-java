package arrays;

import java.util.ArrayList;
import java.util.List;

public class ContemElementos {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(7);

        if (lista.contains(4)) {
            System.out.println("Contém um 4");

        } else System.out.println("Não contém um 4");

        if (lista.contains(7)) {
            System.out.println("Contém um 7");
        } else System.out.println("Não contém um 7");


    }
}


   /* Escreva um programa Java para testar se um determinado array de inteiros de comprimento 2 contém um 4 ou um 7.

        Matriz Original: [5, 7]
        verdadeiro
*/
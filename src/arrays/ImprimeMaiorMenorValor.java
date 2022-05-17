package arrays;

public class ImprimeMaiorMenorValor {
    public static void main(String[] args) {

        int[] numeros = {20, 30, 40, 50, 60};

        int primeiroValor = numeros[0];

        if (numeros[4] > primeiroValor) {
            primeiroValor = numeros[4];

        }

        System.out.println("O maior valor é: " + primeiroValor);


    }
}


/*    Escreva um programa Java para obter o maior valor entre o primeiro e o último elemento de um array de inteiros.*/

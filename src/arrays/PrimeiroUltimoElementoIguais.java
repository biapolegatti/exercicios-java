package arrays;

public class PrimeiroUltimoElementoIguais {

    public static void main(String[] args) {

        int[] numeros = {50, -20, 0, 30, 40, 60, 10};

        System.out.println((numeros[0] == 10 && numeros[numeros.length-1] == 10));

    }
}


/* Escreva um programa Java para testar se o primeiro e o último elemento de um array de inteiros são iguais. O comprimento do array deve ser maior ou igual a 2. Vá para o editor
     Test Data: array = 50, -20, 0, 30, 40, 60, 10
     Sample Output:
      falso*/

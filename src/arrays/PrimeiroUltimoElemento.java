package arrays;

public class PrimeiroUltimoElemento {

    public static void main(String[] args) {

        int[] numeros = {10, -20, 0, 30, 40, 60, 10 };

        System.out.println((numeros[0] == 10 || numeros[numeros.length-1] == 10));
    }
}


  /*  Escreva um programa Java para testar se 10 aparece como o primeiro ou o último elemento de um array de inteiros.
  O comprimento do array deve ser maior ou igual a 2.
         Test Data: array = 10, -20, 0, 30, 40, 60, 10

        verdadeiro*/
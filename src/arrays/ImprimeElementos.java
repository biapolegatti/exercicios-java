package arrays;

public class ImprimeElementos {
    public static void main(String[] args) {

        // duas formas de criar o array: as duas estão certas.

        int[] numeros = {1, 2, 3, 4, 5, 6};

        int[] numeros2 = new int[6];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 3;
        numeros2[3] = 4;
        numeros2[4] = 5;
        numeros2[5] = 6;

        System.out.println("Imprimindo o Array numeros");

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);
        }

        System.out.println("\nImprimindo o Array em ordem inversa");
        for (int contador = (numeros.length - 1); contador >= 0; contador--) {
            System.out.println(numeros[contador]);

        }

    }
}


/*
 Crie um array de seis números inteiros. Mostre-os na ordem inversa.
*/




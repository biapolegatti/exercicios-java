package basicos;

public class ImprimeNumeroImpar {

    public static void main(String[] args) {

        for (int contador = 1; contador <= 99; contador++) {
            int numeroImpar =+ contador;
            if (numeroImpar % 2 == 1) {
                System.out.println(numeroImpar);
            }
        }
    }

}








 /*   Escreva um programa Java para imprimir os números ímpares de 1 a 99. Imprime um número por linha. Vá para a saída de amostra do editor:

        1
        3
        5
*/
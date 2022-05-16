package basicos;

import java.util.Scanner;

public class CalculaDistancia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro ponto: ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        System.out.println("Informe o segundo ponto: ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        double distanciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("%.4f%n", distanciaXY);

        //Dentro do Math.srqt é aquilo que eu quero que ele faça a raiz quadrada, então ele vai fazer a raiz quadrada do (Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2)
        //Math.pow para dizer que eu quero elevar ao quadrado, no caso eu estou falando que eu quero a raiz quadrada de x2 - x1 e y1 - y2
        //Ele vai calcular a raiz quadrada de x2 - x1 elevada ao quadrado + y1 - y2 elevado ao quadrado
        //o %.4f é para ele quebrar em quatro dígitos depois do ponto

    }

}

   /* Escreva um programa Java para calcular a distância entre dois pontos na superfície da Terra.
       Distância entre os dois pontos [ (x1,y1) & (x2,y2)]
        d = raio * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos( y1 - y2))
        Raio da Terra r = 6371,01 Quilômetros
        Dados de entrada:
        Insira a latitude da coordenada 1: 25
        Insira a longitude da coordenada 1: 35
        Insira a latitude da coordenada 2: 35,5
        Insira a longitude da coordenada 2: 25,5
        Saída esperada

        A distância entre esses pontos é: 1480,0848451069087 km
*/

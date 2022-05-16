package basicos;

public class ImprimeRosto {

    public static void main(String[] args) {

        String[] caracteres = new String[5];
        caracteres[0] = " +\"\"\"\"\"+ ";
        caracteres[1] = "[| o o |]";
        caracteres[2] = " |  ^  |";
        caracteres[3] = " | '-' |";
        caracteres[4] = " +-----+";

        for(int contador = 0; contador < caracteres.length; contador++) {
            System.out.println(caracteres[contador]);

        }
    }
}


/*
    Escreva um programa Java para imprimir um rosto. Saída esperada

 +"""""+
[| oi |]
 | ^ |
 | '-' |
 +-----+

 */

package Excecoes.RuntimeExepction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        int entradaX = 0;
        int entradaY = 0;
        Scanner ler = new Scanner(System.in);


        try {
            System.out.println("Digite o valor de X");
            entradaX = ler.nextInt();

            System.out.println("Digite o valor de Y para dividir");
            entradaY = ler.nextInt();

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Ta dividindo por 0? Ou colocando Letra? Gênio d+");
        }

        x = entradaX;
        y = entradaY;
        x = x / y;
        System.out.println("Resultado : \"" + x );


    }
}

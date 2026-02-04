package Excecoes.RuntimeExepction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Treino01NaRaca {
    public static void main(String[] args) {
        int s1 = 0;
        int s2 = 0;
        Scanner sistema = new Scanner(System.in);

        try {
            System.out.println("Digite o Valor X :");
            s1 = sistema.nextInt();
            System.out.println("Digite o Valor Y :");
            s2 = sistema.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Digita apenas número");

        }

        sistema.close();


        try{
            s1 = s1 / s2;
        }catch(ArithmeticException e) {
            System.out.println("Divisão por 0 é invalida");

        }

        System.out.println("Resultado da divisão : " + s1);
    }
    public int Somar(int a, int b){
        int resultado = a + b;
        return resultado;

    }
    //tenho que aprender melhor sozinho a mecher com metodos não Void!
}

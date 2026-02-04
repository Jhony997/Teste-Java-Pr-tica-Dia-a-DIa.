package Excecoes.CodigoErradoIA;

import java.util.InputMismatchException;
import java.util.Scanner;
// VOU APRENDER SEM IA PLMDS
public class CaixaSimplesBugado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double total = 0;
        double banco = 0;
        boolean rodando = true;
        int valor;


        System.out.println("=== CAIXA REGISTRADORA ===");
        System.out.println("Digite valores para somar ao total.");
        System.out.println("Digite -1 para sair.");

        while (rodando) {
            System.out.print("Valor: ");

            try {
                valor = ler.nextInt(); // proposital

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas número possível");
                ler.next();
                continue;
            }

            if (valor == -1) {
                rodando = false;
            }

            // erro proposital aqui
            banco = banco + valor;
            banco = banco * 0.05;
            total = banco + valor;

            if (total > 999) {
                System.out.println("Estourou o limite!");
                rodando = false;
            }
        }


        System.out.println("Total parcial: " + banco);
        System.out.println("Total final: " + total);
        ler.close();
    }
}


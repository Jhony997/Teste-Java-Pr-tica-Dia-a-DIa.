package Excecoes.CodigoErradoIA;
import java.util.InputMismatchException;
import java.util.Scanner;

//Muito dificil ainda para corrigir

public class LojaBugada {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int moedas = 10;
        int opcao;

        System.out.println("=== LOJA ===");
        System.out.println("1 - Comprar poção (5 moedas)");
        System.out.println("2 - Comprar espada (10 moedas)");
        System.out.println("3 - Vender item (+3 moedas)");
        System.out.println("0 - Sair");

        boolean rodando = true;

        while (rodando) {
            System.out.print("Escolha: ");
            try{
            opcao = ler.nextInt();


            if (opcao == 1) {
                moedas = moedas - 5;
                System.out.println("Comprou poção! Moedas: " + moedas);
            }

            if (opcao == 2) {
                System.out.println("Comprou espada! Moedas restantes: " + moedas);
                moedas = moedas - 10;
            }

            if (opcao == 3) {
                System.out.println("Vendeu um item!");
                // valor estranho proposital
                moedas = moedas + (5 - 2);
            }

            if (opcao == 0) {
                System.out.println("Saindo...");
                rodando = false;
            }

            // condição propositalmente estranha
            if (moedas <= 0) {
                System.out.println("Você ficou sem moedas!");
                rodando = false;
            }
        }catch (InputMismatchException e){
                System.out.println("Digite Apenas números abaixo de 3");
            }ler.next();
         }

        System.out.println("Total final de moedas: " + moedas);
        ler.close();
    }
}


package EstruturaDados.Teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AbuscaBinariaVirtual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite o tamanho virtual do array (ex: 100000000000): ");
            long tamanho = input.nextLong(); // aqui usa nextLong

            if (tamanho <= 0) {
                System.out.println("Tamanho precisa ser positivo.");
                return;
            }

            System.out.print("Digite o valor que quer procurar (0 .. tamanho-1): ");
            long valorProcurado = input.nextLong();

            long inicioTempo = System.nanoTime();
            ResultadoBuscaLong resultado = buscaBinariaVirtual(tamanho, valorProcurado);
            long fimTempo = System.nanoTime();

            if (resultado.posicao != -1) {
                System.out.println("Valor encontrado na posição " + resultado.posicao);
            } else {
                System.out.println("Valor não encontrado!");
            }

            System.out.println("Comparações feitas: " + resultado.comparacoes);
            double tempoMs = (fimTempo - inicioTempo) / 1_000_000.0;
            System.out.println("Tempo de busca: " + tempoMs + " ms");

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Use números inteiros (long).");
        } finally {
            input.close();
        }
    }

    static class ResultadoBuscaLong {
        long posicao;
        long comparacoes;
        ResultadoBuscaLong(long posicao, long comparacoes) {
            this.posicao = posicao;
            this.comparacoes = comparacoes;
        }
    }

    /**
     * Busca binária virtual: o "array" é implicitamente [0, 1, 2, ..., tamanho-1]
     * (valor no índice i é i). Não há alocação.
     */
    public static ResultadoBuscaLong buscaBinariaVirtual(long tamanho, long valor) {
        long inicio = 0;
        long fim = tamanho - 1;
        long comparacoes = 0;

        while (inicio <= fim) {
            long meio = inicio + (fim - inicio) / 2; // evita overflow
            comparacoes++;

            // aqui simulamos que valor em 'meio' é 'meio' (f(i) = i)
            if (meio == valor) {
                return new ResultadoBuscaLong(meio, comparacoes);
            } else if (meio < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return new ResultadoBuscaLong(-1, comparacoes);
    }
}


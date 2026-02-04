package EstruturaDados.Teste;

import java.math.BigInteger;

public class BigIntegerTeste {
    public static void main(String[] args) {
        System.out.println("🚀 Iniciando teste de crescimento exponencial com BigInteger...\n");

        long inicioTempo = System.nanoTime();

        BigInteger numero = BigInteger.ONE;
        int iteracao = 0;

        Runtime runtime = Runtime.getRuntime();

        while (true) {
            iteracao++;
            numero = numero.multiply(BigInteger.TWO); // dobra o valor

            // mostra jogos a cada 1 milhão de iterações
            if (iteracao % 1_000_000 == 0) {
                long usado = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);

                System.out.println("Iteração: " + iteracao);
                System.out.println("Tamanho em bits: " + numero.bitLength());
                System.out.println("Dígitos decimais: " + numero.toString().length());
                System.out.println("Memória usada: " + usado + " MB");
                System.out.println("----------------------------");

                // segurança pra não fritar a RAM
                if (usado > 512) { // se estiver usando mais de ~512MB, para
                    long fimTempo = System.nanoTime();
                    double tempoSegundos = (fimTempo - inicioTempo) / 1_000_000_000.0;
                    System.out.println("\n🛑 Limite seguro atingido!");
                    System.out.println("Tempo total: " + tempoSegundos + " segundos");
                    System.out.println("Bits finais: " + numero.bitLength());
                    break;
                }
            }
        }

        System.out.println("\n✅ Finalizado com segurança.");
    }
}


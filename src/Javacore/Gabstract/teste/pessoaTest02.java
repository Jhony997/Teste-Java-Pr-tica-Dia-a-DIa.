package Javacore.Gabstract.teste;

import Javacore.Gabstract.dominio.ContaCorrente;
import Javacore.Gabstract.dominio.ContaPoupanca;

public class pessoaTest02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(670,"Ana");
        ContaPoupanca contaPoupanca = new ContaPoupanca(400,"Carlos");

        contaPoupanca.calcularRendimento();
        contaPoupanca.imprime();

        contaCorrente.calcularRendimento();
        contaCorrente.imprime();
    }
}

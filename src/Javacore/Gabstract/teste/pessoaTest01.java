package Javacore.Gabstract.teste;

import Javacore.Gabstract.dominio.Pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1900, "João");
        pessoa.calcularRendimento();
        pessoa.imprime();
    }

}

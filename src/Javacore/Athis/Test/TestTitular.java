package Javacore.Athis.Test;

import Javacore.Athis.Dominio.Titular;

public class TestTitular {
    public static void main(String[] args) {

        Titular titular = new Titular();
        titular.setNome("Jonas");
        titular.setSalario(1456.80);
        titular.imprime();

        System.out.println("-------------");

        titular = new Titular();
        titular.imprime();
    }
}

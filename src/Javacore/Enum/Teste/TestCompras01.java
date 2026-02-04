package Javacore.Enum.Teste;

import Javacore.Enum.Dominio.Compras;
import Javacore.Enum.Dominio.Lista;

public class TestCompras01 {
    public static void main(String[] args) {
    Compras pessoa = new Compras("João", Lista.BATATA);

        System.out.println(pessoa);

    }
}

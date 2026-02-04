package Javacore.Bcondicional.teste;

import Javacore.Bcondicional.Dominio.Texto;
import Javacore.Bcondicional.Dominio.Valores;

public class teste01 {
    public static void main(String[] args) {
        Valores vazio = new Valores();
        Valores joao = new Valores(12,18,"João");
        Valores carlos = new Valores(32,18,"Carlos");
        Valores ana = new Valores(18,18,"Ana");
        Valores dani = new Valores(14,18,"Dani");

        Texto imprime = new Texto(joao);
        Texto imprime1 = new Texto(carlos);
        Texto imprime2 = new Texto(ana);
        Texto imprime3 = new Texto(dani);

        imprime.imprime();
        imprime1.imprime();
        imprime2.imprime();
        imprime3.imprime();




    }
}

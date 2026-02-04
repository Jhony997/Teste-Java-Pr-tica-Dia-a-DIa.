package Javacore.Cpoliomorfismo.Impressora;

import Javacore.Cpoliomorfismo.Dominio.Jogador;
import Javacore.Cpoliomorfismo.Dominio.Time;

public class Imprime {

    public void local1(Jogador s1, Time s2){
        System.out.println("Jogador : " + s1.getNome() + "   /   " + "Time : " + s2.getTime());
    }

}

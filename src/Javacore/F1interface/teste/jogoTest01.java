package Javacore.F1interface.teste;

import Javacore.F1interface.dominio.EstadosDoJogo;
import Javacore.F1interface.dominio.Joao;
import Javacore.F1interface.dominio.Jogo;
import Javacore.F1interface.dominio.Pedro;

public class jogoTest01 {
    public static void main(String []args){
        Pedro pedro = new Pedro("GGPedro_Easy",80.7,17, EstadosDoJogo.FORTNITE.getNome());
        Joao joao = new Joao("JJ_Matador",167.5,24,EstadosDoJogo.MINECRAFT.getNome());

        Jogo.imprime(pedro);
        Jogo.imprime(joao);


    }
}

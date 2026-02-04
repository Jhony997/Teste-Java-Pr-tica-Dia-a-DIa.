package Poliomorfismo.BTeste.teste;

import Poliomorfismo.BTeste.dominio.Inimigo;
import Poliomorfismo.BTeste.dominio.Personagem;
import Poliomorfismo.BTeste.dominio.StatusImprime;

public class Teste01 {
    public static void main(String[] args) {
        Personagem Alam = new Personagem("Alam",8,2,3);
        Inimigo goblin = new Inimigo("Goblin",4,2,1);
        StatusImprime info = new StatusImprime();

        info.imprime(Alam);
        info.imprime(goblin);
    }
}

package Javacore.Athis.Test;

import Javacore.Athis.Dominio.Rpg;
import Javacore.Athis.Dominio.RpgAtacar;
import Javacore.Athis.Dominio.RpgInimigos;

public class RpgTest01 {
    public static void main(String[] args) {

        RpgAtacar atacar = new RpgAtacar();
        Rpg jogo = new Rpg(3.5,1.0,100,"Kelvin");
        atacar.setTurnos(2);
        jogo.imprime();


        RpgInimigos slime = new RpgInimigos(1,0.5,10,"Slime");
        slime.imprime();
        RpgInimigos globin = new RpgInimigos(2,2,20,"globin");
        globin.imprime();
        RpgInimigos dragao = new RpgInimigos(10,5,100,"Dragão");
        dragao.imprime();


        System.out.println("--- Ação ---");

        jogo.atacar(slime);
        jogo.imprime();
        slime.imprime();

        /*
        System.out.println("---  Ação Iniciada ---");

        for(double i = 0;i <= atacar.turnos;i++){
            inimigos.setHp(inimigos.getHp() - jogo.getDano());
       }
        jogo.setMoney(jogo.getMoney() + inimigos.getMoney() );

       System.out.println("\uD83D\uDC64 :" + inimigos.getUser());
        System.out.println("\uD83E\uDD0D : " + jogo.getHp());
      System.out.println("Money + \uD83D\uDCB0 :" + inimigos.getMoney());

        jogo.imprime();
       inimigos.imprime();


         */

        /*
         Usa como esbosso
          */
    }
}

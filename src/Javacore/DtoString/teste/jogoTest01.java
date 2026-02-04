package Javacore.DtoString.teste;

import Javacore.DtoString.Metodo.GameTester;
import Javacore.DtoString.Metodo.Programador;

public class jogoTest01 {
    public static void main(String[] args) {
        GameTester valorant = new GameTester("Valorant",20.5);
        Programador programador = new Programador("Jason",90.7);


        programador.imprime();
        valorant.imprime();




    }
}

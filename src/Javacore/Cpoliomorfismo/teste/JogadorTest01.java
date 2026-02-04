package Javacore.Cpoliomorfismo.teste;

import Javacore.Cpoliomorfismo.Dominio.Jogador;
import Javacore.Cpoliomorfismo.Dominio.Time;
import Javacore.Cpoliomorfismo.Impressora.Imprime;

public class JogadorTest01 {
    public static void main(String[] args) {
        Time s1 = new Time("Santos");
        Jogador j1 = new Jogador("Romário");
        Time s2 = new Time("Flamengo");
        Jogador j2 = new Jogador("Jerfersson");
        Time s3 = new Time("Galo");
        Jogador j3 = new Jogador("Abner");
        Jogador j4 = new Jogador("Kelvin");
        Imprime impressora = new Imprime();

        System.out.println("sozinho : " + s1);//imprime o valor do heap e memoria! //ERRADO
        System.out.println("sozinho + get : " + s1.getTime());//da get do valor da stack atual? //ERRADO
        s1.imprime();//dentro do imprime this.

        System.out.println("---Poliomorfismo---");
        //poliomorfismo entre 2 classes :O
        impressora.local1(j1,s1);
        impressora.local1(j2,s2);
        impressora.local1(j3,s3);

        impressora.local1(j4,s2);
    }
}

//Stack = referência
//Heap = Objeto Real
// STACK: s1  ───────► HEAP: Time { nome = "Santos" }
// Java é 100% pass-by-value
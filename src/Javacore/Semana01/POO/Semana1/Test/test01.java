package Javacore.Semana01.POO.Semana1.Test;

import Javacore.Semana01.POO.Semana1.Dominio.BancoBradesco;
import Javacore.Semana01.POO.Semana1.Dominio.BancoITAU;
import Javacore.Semana01.POO.Semana1.Dominio.ImprimeRelatorio;
import Javacore.Semana01.POO.Semana1.Dominio.Pessoa;

public class test01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        Pessoa p2 = new Pessoa("Carlos");
        BancoBradesco bradesco = new BancoBradesco(p1,1500);
        BancoITAU itau = new BancoITAU(p2,87.900);
        ImprimeRelatorio imprime = new ImprimeRelatorio();

        imprime.Impressora(bradesco);
        imprime.Impressora(itau);
    }
}

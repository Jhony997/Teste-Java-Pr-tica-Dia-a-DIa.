package Poliomorfismo.ATeste.Test;

import Poliomorfismo.ATeste.Dominio.Carro;
import Poliomorfismo.ATeste.Dominio.Celular;
import Poliomorfismo.ATeste.Dominio.Computador;
import Poliomorfismo.ATeste.Potencia.Imposto;

public class Test01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", 50000,240);
        Celular celular = new Celular("Samsung",4000,150);
        Computador computador = new Computador("Philips",2000,90);

        Imposto.calculaImposto(carro);
        Imposto.calculaImposto(celular);
        Imposto.calculaImposto(computador);
    }
}

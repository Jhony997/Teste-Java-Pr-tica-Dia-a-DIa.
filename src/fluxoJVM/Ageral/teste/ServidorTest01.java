package fluxoJVM.Ageral.teste;

import fluxoJVM.Ageral.dominio.Pack;
import fluxoJVM.Ageral.dominio.Servidor1;
import fluxoJVM.Ageral.dominio.Servidor2;

public class ServidorTest01 {
    public static void main(String[] args) {
        Servidor1 servidor1 = new Servidor1(1);
        Servidor2 servidor2 = new Servidor2(1);
        Pack pacote = new Pack(10);



        System.out.println(servidor1.getServidorRecebePacotes());
        System.out.println(servidor2.getServidorRecebePacotes());
        System.out.println(pacote.getPacotes());
    }
}

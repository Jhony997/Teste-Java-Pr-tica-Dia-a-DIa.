package Javacore.Semana01.POO.Semana1.Dominio;

public class ImprimeRelatorio {

    public void Impressora(BancoBradesco bs){
        System.out.println("Cliente : " + bs.getCliente() );
        System.out.println("Dinheiro : " + bs.getDinheiro() + "$");
        System.out.println("--- End Line ---");
    }
}

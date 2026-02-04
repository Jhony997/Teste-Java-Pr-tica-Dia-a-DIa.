package Poliomorfismo.ATeste.Potencia;

import Poliomorfismo.ATeste.Dominio.Produto;

public class Imposto {

    public static void calculaImposto(Produto produto){
        System.out.println("Relatorio de imposto //");
        double imposto = produto.calculaImposto();
        System.out.println("Nome do produto : " + produto.getNome());
        System.out.println("Valor do produto : " + produto.getValor());
        System.out.println("Imposto a ser pago : " + imposto);
        System.out.println("-----------//-----------------");
    }
}

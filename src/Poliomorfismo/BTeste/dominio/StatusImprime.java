package Poliomorfismo.BTeste.dominio;

public class StatusImprime {
    //só to sabendo passar valor deve ter coisa mais complexa de ser feito !!!

    public void imprime(FichaRpg fichaRpg){
        System.out.println("-----Catalogo-----");
        System.out.println("Nome : " + fichaRpg.getNome());
        System.out.println("HP : " + fichaRpg.getVida());
        System.out.println("Dano : " + fichaRpg.getDano());
        System.out.println("Defesa : " + fichaRpg.getDefesa());
    }
}

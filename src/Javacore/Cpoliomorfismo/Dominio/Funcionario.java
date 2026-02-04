package Javacore.Cpoliomorfismo.Dominio;

public class Funcionario {
    protected String nome;
    protected double dinheiro;
    protected String classe;

    public Funcionario(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public Funcionario(String nome, double dinheiro, String classe) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.classe = classe;
    }

    public double calculasalario(){
        return dinheiro;
    }

    public void imprime(){
        System.out.println(this.nome + " = " +this.dinheiro+"$");
        System.out.println("----------");
    }
    public void imprime1(){
        System.out.println( this.classe+ " / " + this.nome + " = " +this.dinheiro+"$");
        System.out.println("----------");
    }


}

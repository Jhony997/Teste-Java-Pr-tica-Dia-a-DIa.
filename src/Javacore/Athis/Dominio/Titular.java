package Javacore.Athis.Dominio;

public class Titular {
    private String nome;
    private double salario;
    public final double pagamento = 1500.90;

    public Titular() {
        this("desconhecido",0.0);
    }

    public Titular(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime(){
        System.out.println( "Usuário : " + this.nome );
        System.out.println( "Saldo Atual : " + this.salario );
        System.out.println( "Pagamento : " + this.pagamento );

    }
}

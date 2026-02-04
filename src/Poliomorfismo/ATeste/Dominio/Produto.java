package Poliomorfismo.ATeste.Dominio;

public abstract class Produto implements Taxavel {
    private String nome;
    private double valor;
    private double potencia;

    public Produto(String nome, double valor, double potencia) {
        this.nome = nome;
        this.valor = valor;
        this.potencia = potencia;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


}

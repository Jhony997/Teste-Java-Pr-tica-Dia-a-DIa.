package Javacore.Semana01.POO.Semana1.Dominio;

public class BancoBradesco {
    private String cliente;
    private double dinheiro;

    public BancoBradesco(Pessoa ps, double dinheiro) {
        this.cliente = ps.getPessoa(); ;
        this.dinheiro = dinheiro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}

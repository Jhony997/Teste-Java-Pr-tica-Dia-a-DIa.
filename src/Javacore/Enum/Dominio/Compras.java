package Javacore.Enum.Dominio;

public class Compras {
    private String carrinho;
    private Lista lista;


    public Compras(String carrinho, Lista lista) {
        this.carrinho = carrinho;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "carrinho='" + carrinho + '\'' +
                ", lista=" + lista.getnome() +
                ", listaInt=" + lista.getValor() +
                '}';
    }

    public String getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(String carrinho) {
        this.carrinho = carrinho;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
}

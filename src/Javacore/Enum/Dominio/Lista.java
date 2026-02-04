package Javacore.Enum.Dominio;

public enum Lista {
COMPRAS_ITEM("Carrinho",1), MACARRAO("Macarrão",1), BATATA("Batata",2), ARROZ("Arroz",3);

private String nome;
private int valor;

    Lista(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getnome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}

package Javacore.Bcondicional.Dominio;

public class Valores {
    private int idade ;
    private int bar;
    private String nome;

   public Valores(){

   }
    public Valores(int idade, int bar, String nome) {
        this.idade = idade;
        this.bar = bar;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getBar() {
        return bar;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


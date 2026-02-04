package Javacore.F1interface.dominio;

public enum EstadosDoJogo {
    MINECRAFT("Minecraft",10),
    FORTNITE("Fortnite",15);

    private final int id;
    private final String nome;

    EstadosDoJogo(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

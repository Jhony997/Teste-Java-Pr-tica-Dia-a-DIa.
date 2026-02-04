package Javacore.Semana01.POO.Exercicio01.Dominio;

public enum Lista {
    COMPRAS("manhã"),
    TARDE("tarde"),
    NOITE("noite");

    private String descricao;

    Lista(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

//https://www.devmedia.com.br/enums-no-java/38764

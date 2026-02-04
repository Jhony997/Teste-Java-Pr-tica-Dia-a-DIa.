package IntroducaoMetodos.Metodo;

import org.w3c.dom.ls.LSOutput;

public class Anime {
    private String nome;
    private String genero;
    private int[] episodios;

    {
        System.out.println("Bloco de Inicialização First");
        episodios = new int[24];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome, String genero){
        this.genero = genero;
        this.nome = nome;
    }

    public Anime(String nome, String genero,int episodios) {
        this(nome, genero);


    }

    public Anime() {
    }

    public void imprim(){
        System.out.println(this.genero);
        System.out.println(this.nome);
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

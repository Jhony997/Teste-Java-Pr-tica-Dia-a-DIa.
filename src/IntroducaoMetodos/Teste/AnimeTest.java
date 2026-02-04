package IntroducaoMetodos.Teste;

import IntroducaoMetodos.Metodo.Anime;
import IntroducaoMetodos.Metodo.Heranca;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen","Shounen",0);


        anime.imprim();
        for (int episodios : anime.getEpisodios()){
            System.out.print("Episódio : " + episodios + " /");
        }
    }
}


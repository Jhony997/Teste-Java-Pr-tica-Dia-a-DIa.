package Javacore.F1interface.dominio;

public interface Jogo {
    public static void imprime(Jogadador jogadador){
        System.out.println("--------Servidor Informação--------");
        System.out.println("Jogo : " + jogadador.getJogo());
        System.out.println("Nome do Jogador : " + jogadador.getNome());
        System.out.println("Level : " + jogadador.getLevel());
        System.out.println("Dinheiro : " + jogadador.getDinheiro());
    }

    //errado é melhor criar uma classe para implementar!!
    //preciso melhorar no enum e usar : Scanner, codição, loop e usar Exceção!!
}

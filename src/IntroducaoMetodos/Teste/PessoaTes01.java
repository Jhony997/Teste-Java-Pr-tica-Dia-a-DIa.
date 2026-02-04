package IntroducaoMetodos.Teste;

import IntroducaoMetodos.Metodo.Heranca;
import IntroducaoMetodos.Metodo.Pessoa;

public class PessoaTes01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setPessoa("Ronadlo");
        pessoa.setIdade("21");
        pessoa.imprime();

        System.out.println("-----------");

        Heranca jogador = new Heranca();
        jogador.setMoney("1000$");
        jogador.setPessoa("CR7");
        jogador.setIdade("45");
        jogador.imprime();


    }
}

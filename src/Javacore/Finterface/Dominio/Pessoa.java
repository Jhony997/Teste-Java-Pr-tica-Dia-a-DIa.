package Javacore.Finterface.Dominio;

public class Pessoa implements Acao, Idade{
    public String nome;
    public String passos;

    public Pessoa(String nome, String passos) {
        this.nome = nome;
        this.passos = passos;
    }
    public void imprime(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Passos : " + this.passos);
        System.out.println(caminhou());
        System.out.println(parou());
        System.out.println(executou());
        System.out.println(getAcaoFinal());
        System.out.println(age());
    }

    @Override
    public String caminhou() {
        return "Começou a cançar 150m";
    }

    @Override
    public String parou() {
        return "parou em 200m";
    }

    @Override
    public String executou() {
        return "Comeu um lanche";
    }

    @Override
    public String getAcaoFinal() {
        return "Voltou ";
    }

    @Override
    public String age() {
        return "Tinha 20 anos";
    }
}

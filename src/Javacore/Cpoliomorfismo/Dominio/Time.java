package Javacore.Cpoliomorfismo.Dominio;

public class Time {
    private String selecao;

    public Time(String selecao) {
        this.selecao = selecao;
    }

    public String getTime() {
        return selecao;
    }

    public void setTime(String selecao) {
        this.selecao = selecao;
    }

    public void imprime(){
        System.out.println("Dentro da Classe Time no Metodo Imprime : " + this.selecao);
    }
}

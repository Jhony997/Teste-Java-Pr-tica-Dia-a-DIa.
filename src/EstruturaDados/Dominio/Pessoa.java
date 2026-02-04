package EstruturaDados.Dominio;

public class Pessoa {
    private String nome;
    private String valor;
    private String saque;


    public Pessoa(String nome, String valor, String saque) {
        this.nome = nome;
        this.valor = valor;
        this.saque = saque;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.saque);
        System.out.println(this.valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", valor='" + valor + '\'' +
                ", saque='" + saque + '\'' +
                '}';
    }
    static {
        System.out.println("----- Código Inciciado -----");
    }

}

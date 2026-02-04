package IntroducaoMetodos.Metodo;

public class Pessoa {
    protected String pessoa;
    protected String idade;

    public void imprime(){
        System.out.println("Nome : " + this.pessoa);
        System.out.println("Idade : " + this.idade);
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}

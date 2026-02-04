package IntroducaoMetodos.Metodo;

public class Heranca extends Pessoa{
    private String money;


    public void imprime(){
    super.imprime();
        System.out.println(this.money);
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}

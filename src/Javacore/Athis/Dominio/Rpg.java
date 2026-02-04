package Javacore.Athis.Dominio;

public class Rpg {
    private double hp;
    private double dano;
    private long money;
    private String user;

    public Rpg(double hp, double dano, long money, String user) {
        this.hp = hp;
        this.dano = dano;
        this.money = money;
        this.user = user;
    }

    public Rpg() {
    }

    public void imprime(){
        System.out.println("\uD83D\uDC64 :" + this.user );
        System.out.println("\uD83E\uDD0D :" + this.hp );
        System.out.println("\uD83D\uDDE1\uFE0F :" + this.dano );
        System.out.println("\uD83D\uDCB0 :" + this.money );
        System.out.println("________________");
    }


    public void atacar(Rpg alvo){
        alvo.hp = alvo.hp - this.dano;
        this.hp = this.hp - alvo.dano;

        if(alvo.hp == 0){
            System.out.println(this.user + " Matou " + alvo.user);
            this.money = this.money + alvo.money;
        }else if(this.hp == 0){
            System.out.println(alvo.user  + " Matou " + this.user);
        }

    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

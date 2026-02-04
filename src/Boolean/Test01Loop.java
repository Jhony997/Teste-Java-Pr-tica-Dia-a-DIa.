package Boolean;
//3 Tipos de Loop
/*
For Each : 👉 Usado pra percorrer arrays ou coleções (listas).
For clássico : 👉 O mais versátil. Tu controla início, condição e incremento.
While : 👉 Repete enquanto a condição for verdadeira.
 */
public class Test01Loop {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        boolean rodando = true;

        while (rodando){
            x++;
            y++;
            System.out.println("Posição y : " + y+"N\"" + "  Posição X : " + x+"N\"");

            if(x >= 20 || y >= 30){
                rodando = false;
            }
        }
    }
}

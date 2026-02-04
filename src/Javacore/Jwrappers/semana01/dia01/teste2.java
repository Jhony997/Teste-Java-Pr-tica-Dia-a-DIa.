package Javacore.Jwrappers.semana01.dia01;

public class teste2 {
    public static void main(String[] args) {
        int flag = 0;

        boolean cabos = false;
        boolean c1 = false;
        boolean c2 = false;
        boolean c3 = false;

        for (int i = 0; i < 20; i++){
            flag = i;
            System.out.println("Flag 1 : " + flag);

            if(flag == 1){
                cabos = true;
            }else if(flag == 2){
                cabos = false;
            }


            if(cabos == true){
                System.out.println("Fiação Ligadas");
                c1 = true;
                c2 = false;
                c3 = false;
            }


            int flag2 = 0;
            flag2 = i;
            System.out.println("Flag 2 : " + flag2);

            if (flag2 == 3){
                System.out.println("Flag 2 Iniciada");
                c1 = false;
                c2 = true;
                c3 = false;
            }

            if(c2 == true){
                System.out.println("Cabo dois inicializado");
                c3 = true;
            }
            if(c3 == true){
                System.out.println("Fiação 2 desligada" + " Fiação 3 ligadas");
                c2 = false;
                int fiacao = 0;
                fiacao += flag + flag2;

                System.out.println("Fiação 3" + fiacao);
            }
        }


    }
}

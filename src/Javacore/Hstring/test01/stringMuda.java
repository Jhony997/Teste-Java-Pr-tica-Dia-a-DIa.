package Javacore.Hstring.test01;

public class stringMuda {
    public static void main(String[] args) {
        String s1 = "Carlos"; //Pool de Strings
        String s2 = new String("Carlos"); //heap

        String s3 = "";
        String s4 = new String("");

        s3 = s1.concat(" Ferreira");
        s4 = s2.concat(" Pereira");

        //1* duas coisas acontecendo : 1.Pool String (s1 = "Carlos) (s1.concat = "Carlos Ferreira") 2.Heap (s2 = "Carlos" s2.concat = "Carlos Pereira")
        //2* Depois oq fiz? : 1.Pool String (s1 = "Carlos) (s3 = s1.concat = "Carlos Ferreira") 2.Heap (s2 = "Carlos") (s4 = s2.concat = "Carlos Pereira")
        // !!!!!!!! Ele não entra no Pool se eu caoncat ou crie uma nova string!!
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }

    //1.https://cursos.alura.com.br/forum/topico-pool-de-strings-17057
    //2.https://pt.stackoverflow.com/questions/36741/heap-de-memória-java
    //3.https://pt.stackoverflow.com/questions/3797/o-que-são-e-onde-estão-a-stack-e-heap
}

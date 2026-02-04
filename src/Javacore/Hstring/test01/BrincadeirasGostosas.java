package Javacore.Hstring.test01;

public class BrincadeirasGostosas {
    public static void main (String [] args){
        String s1 = "ABCDEFG";
        String numeros = "123";

        System.out.println("String Alfabeto = " + s1);
        System.out.println("String número = " + numeros);
        System.out.println(s1.charAt(6));
        System.out.println(s1.length() + " \" Começa em 0 = 6");
        System.out.println(s1.replace("A","Z" + "  \"Mudei o A"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(numeros.replace("2","9"));

        Integer s2 = Integer.parseInt(numeros);
        System.out.println("String -> Integer.perseInt = " + s2);



    }
}

/*
        String nome = " Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length())); // sempre -1 do que ta passando!
        System.out.println(nome.trim());
 */

package Excecoes.RuntimeExepction;
/*
https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
decoar não e sim entender a Hierarquia
 */


public class ArrayException {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8,9};


        try {
            System.out.println(lista[11]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tamanho de Array Invalido (linha 11) !");
            System.out.println(" Diagnostico (linha 12)");
            e.printStackTrace();
        }

        System.out.println("O Código continua man (Linha 16)");

    }
}

package IntroducaoMetodos.Metodo;

import java.util.Scanner;

public class ArrayBidiomensional {
  //  Scanner inpunt = new Scanner(System.in);
   // int idade = lista.nextInt();
    public int[] lista = {10,20,30,50,80};
    private String nome;

    public void imprime(){
        for(int num : lista){
            System.out.print(nome + num + " // ");
        }
    }

    public ArrayBidiomensional(int[] lista) {
        this.lista = lista;
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public ArrayBidiomensional(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

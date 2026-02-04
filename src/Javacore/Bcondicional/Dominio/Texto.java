package Javacore.Bcondicional.Dominio;

public class Texto  {
    private Valores valores;


    public Texto(Valores valores) {
        this.valores = valores;
        valores.getBar();
        valores.getIdade();
        valores.getNome();
    }

    public void imprime(){
        if(valores.getIdade() < valores.getBar()){
            System.out.println(valores.getNome() + " Menor de idade acesso negado");

        } else if (valores.getIdade() == valores.getBar()) {
            System.out.println(valores.getNome() + " Idade igual pode entrar man");

        }else {
            System.out.println(valores.getNome() + " Maior de idade acesso concedido");
        }

    }
}







//      if(getIdade() < getBar()){
 //          System.out.println(getNome() + " Menor de idade acesso negado");
  //     }else if(getIdade() == getBar()){
    //        System.out.println(getNome() + " Idade igual pode entrar man");
    //    }else{
    //        System.out.println(getNome() + " Maior de idade acesso concedido");
    //    }

//   if (idade < bar){
//      System.out.println("Menor de idade acesso negado");
//   }else if(idade == bar){
//      System.out.println("Idade igual acesso aceito");
//   }else{
//       System.out.println("Maior de idade");
//   } //dando erro
package Javacore.Cpoliomorfismo.teste;

import Javacore.Cpoliomorfismo.Dominio.Estagiario;
import Javacore.Cpoliomorfismo.Dominio.Funcionario;
import Javacore.Cpoliomorfismo.Dominio.Gerente;
import Javacore.Cpoliomorfismo.Dominio.Programador;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario f1 = new Gerente("Carlos",6000,"Gerente");
        Funcionario f2 = new Programador("Ana",4000,"Programador");
        Funcionario f3 = new Estagiario("Pedro",1200,"Estagiario");
        Funcionario f4 = new Programador("Danilo",4500,"Programador");
        Funcionario f5 = new Estagiario("Ricardo",1500);

        //f1.calculasalario();  como?

        Funcionario[] funcionarios = {f1, f2, f3, f4, f5};


        for (int i = 0; i < funcionarios.length; i++){
            funcionarios[i].imprime();
        }

        System.out.println("--------------Outro Loop---------------");

        for(int i = 0; i < funcionarios.length;i++){
            funcionarios[i].imprime1();
        }
    }
}

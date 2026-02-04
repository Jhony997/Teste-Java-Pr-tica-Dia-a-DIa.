package EstruturaDados.Teste;

import EstruturaDados.Dominio.Funcionario;
import EstruturaDados.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", "1500$", "500");
        pessoa.imprime();
        System.out.println(pessoa);

        System.out.println("-------------------------");

        Funcionario funcionario = new Funcionario("Gilberto", "30000$", "1500");
        funcionario.imprime();
    }
}


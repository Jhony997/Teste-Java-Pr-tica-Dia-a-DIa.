package fluxoJVM.Ageral.dominio;
/*
Você precisa revisar esses 8 fundamentos:
1.Ciclo de vida do programa
2.Memória da JVM (Stack / Heap / Method Area)
3.Palavras-chave: this, static, new
4.Fluxo de execução de métodos
5.Referência vs valor
6.Ordem de inicialização
7.Polimorfismo & interfaces
8.Enums
“instancia → heap, referência → stack, method area → guarda classe”

✔ Você anotou: estância → perfeito.
(“Instância” = o objeto real no heap.)

Eu //
1.Method Area(Metaspace) - Dados relacionado a classe ( uma única vez).
2.Heap - Durante a execução ( instâncias ).
3.Stack - carrega as coisas local ( Var local, referências, fluxo de execução ).
 */
public class Fluxo {
public String dominio = "Dentro do dominio fluxo";
private String dominoSemNome;
public static String pertecenAoDomino = "CLASSE ESTATICA";

    public Fluxo(String dominoSemNome) {
        this.dominoSemNome = dominoSemNome;
    }

    public String getDominio() {
        return dominio;
    }

    public void imprime(){
        System.out.println(this.dominio);
        System.out.println(this.dominoSemNome);
    }
}

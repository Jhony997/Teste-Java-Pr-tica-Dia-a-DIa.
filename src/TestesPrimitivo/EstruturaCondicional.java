package TestesPrimitivo;
//&&, ||, ! → pensamento lógico (“é verdade ou não é?”)
//
//&, |, ~, ^, <<, >> → engenharia binária (“como estão os 0 e 1 dentro desse número?”)

public class EstruturaCondicional {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean saida = a && b;

        System.out.println("Alto nivel: " +saida);

        int c = 6;
        int d = 3;
        double value = 6 & 3;

        System.out.print("Binario: " + value);
    }
}

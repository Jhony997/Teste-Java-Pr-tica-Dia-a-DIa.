package Boolean;

public class Wrappers {
    public static void main(String[] args) {

        int tipoPrimitivo = 0;
        String numero = "150";

        Integer espacoMemoria = Integer.parseInt(numero); // autoboxing

        tipoPrimitivo = espacoMemoria; //unboxing

        System.out.println(tipoPrimitivo);

    }
}

package TestesPrimitivo;

public class IfEelse {
    public static void main(String[] args) {
    int idade = 10;
    int bar = 12;

    if (bar < idade){
        System.out.println("permissão não concedida");
    }else if(bar == idade){
        System.out.println("Você pode entrar idade igual");
    }else {
        System.out.println("maior de idade pode entrar");
    }
    }
}

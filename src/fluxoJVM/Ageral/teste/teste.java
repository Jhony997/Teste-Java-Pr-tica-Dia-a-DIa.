package fluxoJVM.Ageral.teste;

import fluxoJVM.Ageral.dominio.Fluxo;

public class teste {
    public static void main(String[] args) {
        String dentroDoTeste = "DentroDoTeste";
        System.out.println(dentroDoTeste);
        Fluxo fluxo = new Fluxo("String do metodo");
        fluxo.imprime();
        System.out.println(Fluxo.pertecenAoDomino);

    }
}

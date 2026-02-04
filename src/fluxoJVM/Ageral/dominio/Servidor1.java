package fluxoJVM.Ageral.dominio;

public class Servidor1 implements Cliente {
    private int servidorRecebePacotes = 0;

    public Servidor1(int servidorRecebePacotes) {
        this.servidorRecebePacotes = servidorRecebePacotes;
    }

    public void setServidorRecebePacotes(int servidorRecebePacotes) {
        this.servidorRecebePacotes = servidorRecebePacotes;
    }

    public int getServidorRecebePacotes() {
        return servidorRecebePacotes;
    }

    @Override
    public void recebe(Pack pacotes) {
        System.out.println(pacotes.getPacotes());
        System.out.println(servidorRecebePacotes);

    }
}

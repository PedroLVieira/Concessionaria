public class Sedan extends Carro{
private boolean tracao2rodas;
private boolean portamala;

    public Sedan(String nome, boolean tracao2rodas, boolean portamala) {
        super.setNome(nome);
        this.tracao2rodas = tracao2rodas;
        this.portamala = portamala;
    }

    public boolean isTracao2rodas() {
        return tracao2rodas;
    }

    public void setTracao2rodas(boolean tracao2rodas) {
        this.tracao2rodas = tracao2rodas;
    }

    public boolean isPortamala() {
        return portamala;
    }

    public void setPortamala(boolean portamala) {
        this.portamala = portamala;
    }


    public Sedan(){
        this.tracao2rodas = true;
        this.portamala = true;
    }

}

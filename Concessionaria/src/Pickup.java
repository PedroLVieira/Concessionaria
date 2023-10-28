public class Pickup extends Carro{
    private boolean tracao4rodas;

    public Pickup(boolean tracao4rodas) {
        this.tracao4rodas = tracao4rodas;
    }

    public Pickup(String nome, boolean tracao4rodas) {
        super.setNome(nome);
        this.tracao4rodas = tracao4rodas;
    }
    public Pickup(){
        this.tracao4rodas = true;
    }
}

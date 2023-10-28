abstract public class Carro {

    public Carro() {
    }

    private String nome;
    private Motor motor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean ligar(boolean c){
        System.out.println("O carro deu partida.");
        return true;
    }
    public boolean desligar(boolean c){
        System.out.println("O Carro foi desligado.");
        return true;
    }
    public boolean acelerar(boolean c){
        System.out.println("O carro foi acelerado.");
        return true;
        }
    public boolean frear(boolean c){
        System.out.println("O carro foi freado.");
        return true;
    }

}

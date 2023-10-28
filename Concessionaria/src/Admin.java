import java.util.ArrayList;

public class Admin extends Estoque{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Admin(String nome) {
        this.nome = nome;
    }

    public Admin() {
    }

    public void vendecarro(Estoque e, Carro c, Cliente cli){
        System.out.println("O carro "+c.getNome()+" foi vendido para o cliente: "+ cli.getNome());
        e.removercarro(c);
    }
}

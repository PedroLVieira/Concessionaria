
public class Cliente {
    private String nome;

    private int idade;

    private Sedan c;
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Sedan getC() {
        return c;
    }

    public void setC(Sedan c) {
        this.c = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}

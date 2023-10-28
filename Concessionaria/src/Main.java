import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("George", 18);
        Admin a1 = new Admin("Iago");
        Estoque e1 = new Estoque();
        Motor m1 = new Motor("Honda",1.6);
        Motor m2 = new Motor("Toyota",2.6);
        Sedan s1 = new Sedan("Civic",true,true);
        Pickup p1 = new Pickup("Hilux",true);
        ArrayList<Carro> estoquecarros = new ArrayList<>();
        s1.setMotor(m1);
        p1.setMotor(m2);
        e1.setEstoquecarros(estoquecarros);
        e1.adicionarcarros(s1);
        e1.adicionarcarros(p1);
        e1.quantidadecarros();
        s1.ligar(true);
        s1.acelerar(true);
        s1.frear(true);
        s1.desligar(true);
        a1.vendecarro(e1, s1, c1);
        e1.quantidadecarros();
    }

}
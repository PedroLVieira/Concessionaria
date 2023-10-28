import java.util.ArrayList;
public class Estoque {
    ArrayList<Carro> estoquecarros = new ArrayList<>();

    public ArrayList<Carro> getEstoquecarros() {
        return estoquecarros;
    }

    public void setEstoquecarros(ArrayList<Carro> estoquecarros) {
        this.estoquecarros = estoquecarros;
    }

    public void adicionarcarros(Carro c){
        estoquecarros.add(c);
    }

    public void quantidadecarros(){
        System.out.println("____________________________________________");
        System.out.println("Estoque de veículos.");
        for(int i = 0 ; i < estoquecarros.size(); i++) {

            System.out.println((i+1)+". " +estoquecarros.get(i).getNome()+ " - Informações | Fabricante: " + estoquecarros.get(i).getMotor().getFabricante() + "     Potência: " + estoquecarros.get(i).getMotor().getPotencia() );
        }
        System.out.println("____________________________________________");
    }
    public void removercarro(Carro c){
        estoquecarros.remove(c);
    }


}

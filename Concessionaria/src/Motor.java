public class Motor {
    private String fabricante;
    private double potencia;

    public Motor(String fabricante, double potencia) {
        this.fabricante = fabricante;
        this.potencia = potencia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void ligar() {
        Sedan carro = new Sedan();
        boolean resultado = carro.ligar(true);
        assertEquals(true, resultado);
    }

    @Test
    void desligar() {
        Sedan carro = new Sedan();
        boolean resultado = carro.desligar(true);
        assertEquals(true, resultado);
    }


    @Test
    void acelerar() {
        Sedan carro = new Sedan();
        boolean resultado = carro.acelerar(true);
        assertEquals(true, resultado);
    }

    @Test
    void frear() {
        Sedan carro = new Sedan();
        boolean resultado = carro.frear(true);
        assertEquals(true, resultado);
    }
}
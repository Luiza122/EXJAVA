import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCustoSemDesconto() {
        Veiculo v = new Veiculo("Gol", 100.0);
        assertEquals(300.0, v.calcularCusto(3));
    }

    @Test
    public void testCustoComDesconto() {
        Veiculo v = new Veiculo("HB20", 100.0);
        assertEquals(630.0, v.calcularCusto(7)); // 10% desconto
    }

    @Test
    public void testCustoComZeroDias() {
        Veiculo v = new Veiculo("Celta", 100.0);
        assertEquals(0.0, v.calcularCusto(0));
    }

    @Test
    public void testCustoComValorNegativo() {
        Veiculo v = new Veiculo("Uno", -100.0);
        assertEquals(0.0, v.calcularCusto(5));
    }

    @Test
    public void testMultaComAtraso() {
        Veiculo v = new Veiculo("Palio", 100.0);
        assertEquals(240.0, v.calcularMulta(2)); // 20% multa por dia
    }

    @Test
    public void testSemMulta() {
        Veiculo v = new Veiculo("Fiesta", 100.0);
        assertEquals(0.0, v.calcularMulta(0));
    }
}

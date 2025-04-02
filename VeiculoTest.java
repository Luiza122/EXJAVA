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
        Veiculo v = new Veiculo("Palio", 100.0);
        assertEquals(630.0, v.calcularCusto(7));
    }

    @Test
    public void testDescontoAtivo() {
        Veiculo v = new Veiculo("Civic", 100.0);
        assertTrue(v.desconto(10));
    }

    @Test
    public void testDescontoInativo() {
        Veiculo v = new Veiculo("Civic", 100.0);
        assertFalse(v.desconto(5));
    }

    @Test
    public void testCustoComZeroDias() {
        Veiculo v = new Veiculo("Uno", 100.0);
        assertEquals(0.0, v.calcularCusto(0));
    }

    @Test
    public void testValorDiariaNegativa() {
        Veiculo v = new Veiculo("HB20", -100.0);
        assertEquals(0.0, v.calcularCusto(5));
    }

    @Test
    public void testMultaComAtraso() {
        Veiculo v = new Veiculo("Celta", 100.0);
        assertEquals(240.0, v.calcularMulta(2)); // 2 dias * 100 * 1.2
    }

    @Test
    public void testMultaSemAtraso() {
        Veiculo v = new Veiculo("Fiesta", 100.0);
        assertEquals(0.0, v.calcularMulta(0));
    }
}


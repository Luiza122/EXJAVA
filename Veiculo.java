public class Veiculo {
    private String modelo;
    private double valorDiaria;


    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    
    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0 || valorDiaria < 0) {
            return 0;
        }

        double total = dias * valorDiaria;

        if (dias >= 7) {
            total *= 0.9; // aplica 10% de desconto
        }

        return total;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 0) {
            return 0;
        }

        return diasAtraso * valorDiaria * 1.2;
    }
}

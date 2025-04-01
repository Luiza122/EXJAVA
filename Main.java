public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Civic", 150.0);

        int diasAluguel = 8;
        int diasAtraso = 2;

        System.out.println("===== Locadora de Veículos =====");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Valor da diária: R$" + carro.getValorDiaria());
        System.out.println("Dias alugados: " + diasAluguel);

        double custo = carro.calcularCusto(diasAluguel);
        System.out.println("Custo total com desconto: R$" + custo);

        double multa = carro.calcularMulta(diasAtraso);
        System.out.println("Multa por atraso de " + diasAtraso + " dias: R$" + multa);
    }
}

import java.util.ArrayList;

abstract class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}

interface Manutencao {
    String realizarManutencao();
}

class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 1000 + (numeroPortas * 100);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada no carro.";
    }
}

class Moto extends Veiculo implements Manutencao {
    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 500 + (cilindrada * 0.5);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada na moto.";
    }
}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Carro("SAV-1234", 2024, 4));
        listaVeiculos.add(new Moto("CBA-5678", 2018, 600));

        for (Veiculo veiculo : listaVeiculos) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do seguro: R$ " + veiculo.calcularValorSeguro());
            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }
            System.out.println();
        }
    }
}

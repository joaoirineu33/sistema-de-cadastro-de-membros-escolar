package model.gas;

public class CilindroGas {
    private int capacidadeMaxima;
    private int capacidadeAtual;
    private int qtdeUltimoConsumo;

    public CilindroGas(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeMaxima;
        this.qtdeUltimoConsumo = 0;
    }

    public void registrarConsumo(int quantidade) throws ConsumoExcedenteException {
        if (quantidade > capacidadeAtual) {
            throw new ConsumoExcedenteException(
                "Erro: Consumo de " + quantidade + 
                " excede a capacidade atual de " + capacidadeAtual + " unidades."
            );
        }
        qtdeUltimoConsumo = quantidade;
        capacidadeAtual -= quantidade;
        System.out.println("Consumo de " + quantidade + " unidades registrado com sucesso.");
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public int getQtdeUltimoConsumo() {
        return qtdeUltimoConsumo;
    }

    public String toString() {
        return "CilindroGas {" +
                "capacidadeMaxima=" + capacidadeMaxima +
                ", capacidadeAtual=" + capacidadeAtual +
                ", qtdeUltimoConsumo=" + qtdeUltimoConsumo +
                '}';
    }
}

package atividade1;

public class SistemaOperacional {
    private computador computador;

    public SistemaOperacional(computador computador) {
        this.computador = computador;
    }

    public void executarPrograma(programa p, boolean exibirTempo) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Falha na instalação do programa: SSD ocupado maior que o disponível.");
        } else if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Falha na execução do programa: Memória RAM insuficiente.");
        } else {
            System.out.println("Programa executado com sucesso!");
            if(exibirTempo) {
                float tempo = (float)p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());
                System.out.println("Tempo de execução do programa: " + tempo + " segundos.");
            }
        }
    }

    public computador getComputador() {
        return computador;
    }

    public void setComputador(computador computador) {
        this.computador = computador;
    }
}
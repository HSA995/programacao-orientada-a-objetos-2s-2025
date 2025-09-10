package atividade1;

public class programa {
    private int memoriaRAMAlocada;
    private int SSDOcupado;
    private int quantidadeOperacoes;

    public programa(int memoriaRAMAlocada, int SSDOcupado, int quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public int getMemoriaRAMAlocada() {
        return memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(int memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public int getSSDOcupado() {
        return SSDOcupado;
    }

    public void setSSDOcupado(int SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public int getQuantidadeOperacoes() {
        return quantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(int quantidadeOperacoes) {
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}
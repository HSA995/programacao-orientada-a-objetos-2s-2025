package atividade1;

public class main {
    public static void main(String[] args) {
        computador comp = new computador(16, 500, 4, 2.5f);
        SistemaOperacional so = new SistemaOperacional(comp);

        programa progSucesso = new programa(8, 200, 1000);
        programa progErroSSD = new programa(8, 600, 1000); // SSD ocupado maior que disponível
        programa progErroRAM = new programa(20, 200, 1000); // RAM alocada maior que disponível

        System.out.println("\nTeste de execução com sucesso:");
        so.executarPrograma(progSucesso, true);

        System.out.println("\nTeste de falha na instalação (SSD):");
        so.executarPrograma(progErroSSD, true);

        System.out.println("\nTeste de falha na execução (RAM):");
        so.executarPrograma(progErroRAM, true);
    }
}
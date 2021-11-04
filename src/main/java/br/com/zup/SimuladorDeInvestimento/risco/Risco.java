package br.com.zup.SimuladorDeInvestimento.risco;

public enum Risco {
    ALTO(0.025),
    MEDIO(0.015),
    BAIXO(0.005);

    private double taxaDeInvestimento;

    Risco(double taxaDeInvestimento) {
        this.taxaDeInvestimento = taxaDeInvestimento;
    }

    public double getTaxaDeInvestimento() {
        return taxaDeInvestimento;
    }

}

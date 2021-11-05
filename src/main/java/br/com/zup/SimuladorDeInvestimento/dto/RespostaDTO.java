package br.com.zup.SimuladorDeInvestimento.dto;

public class RespostaDTO {
    private double valorInvestido;
    private double valorTotalDeLucro;
    private double valorTotal;

    public RespostaDTO() {
    }

    public RespostaDTO(double valorInvestido, double valorTotalDeLucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.valorTotalDeLucro = valorTotalDeLucro;
        this.valorTotal = valorTotal;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorTotalDeLucro() {
        return valorTotalDeLucro;
    }

    public void setValorTotalDeLucro(double valorTotalDeLucro) {
        this.valorTotalDeLucro = valorTotalDeLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

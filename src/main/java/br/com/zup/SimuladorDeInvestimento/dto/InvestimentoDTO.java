package br.com.zup.SimuladorDeInvestimento.dto;

import br.com.zup.SimuladorDeInvestimento.risco.Risco;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;

public class InvestimentoDTO {
    @Email
    private String email;
    private String nome;
    @CPF
    private String cpf;
    private double valorInvestido;
    private Risco risco;

    public InvestimentoDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}

package br.com.zup.SimuladorDeInvestimento.service;

import br.com.zup.SimuladorDeInvestimento.dto.InvestimentoDTO;
import br.com.zup.SimuladorDeInvestimento.dto.RespostaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    List<InvestimentoDTO> investimentos = new ArrayList<>();

    public void salvarInvestimentos(InvestimentoDTO investimentoDTO) {
        investimentos.add(investimentoDTO);
    }

    public double calcularMontante(RespostaDTO respostaDTO) {
        InvestimentoDTO investimentoDTO;
        double montante = Math.pow(respostaDTO.getValorInvestido() + investimentoDTO.getRisco().getTaxaDeInvestimento());
    }


    public List<InvestimentoDTO> exibirInvestimentos() {
        return investimentos;
    }

}

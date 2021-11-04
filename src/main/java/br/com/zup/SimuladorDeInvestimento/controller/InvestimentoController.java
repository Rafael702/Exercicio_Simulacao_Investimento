package br.com.zup.SimuladorDeInvestimento.controller;

import br.com.zup.SimuladorDeInvestimento.dto.InvestimentoDTO;
import br.com.zup.SimuladorDeInvestimento.service.InvestimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping
    public void cadastrarInvestimento(@RequestBody InvestimentoDTO investimentoDTO) {
        investimentoService.salvarInvestimentos(investimentoDTO);
    }

    @GetMapping
    public List<InvestimentoDTO> exibirInvestimentos() {
        return investimentoService.exibirInvestimentos();
    }
}

package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.Movimentacao;
import com.bootCampSantander.controlePonto.repository.MovimentacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao create(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public void delete(Long idMovimentacao){
        movimentacaoRepository.deleteById(idMovimentacao);
    }

    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> findById(Long idMovimentacao){
        return movimentacaoRepository.findById(idMovimentacao);
    }
}

package com.bootCampSantander.controlePonto.service;

import com.bootCampSantander.controlePonto.model.JornadaTrabalho;
import com.bootCampSantander.controlePonto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    //inserir
    public JornadaTrabalho create(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    //alterar
    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    //excluir
    public void delete(Long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }

    //listar todos
    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    //listar por id
    public Optional<JornadaTrabalho> findById(Long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

}

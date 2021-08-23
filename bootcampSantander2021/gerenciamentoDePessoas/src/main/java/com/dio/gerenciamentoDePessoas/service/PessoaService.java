package com.dio.gerenciamentoDePessoas.service;

import com.dio.gerenciamentoDePessoas.dto.PessoaDTO;
import com.dio.gerenciamentoDePessoas.entity.Pessoa;
import com.dio.gerenciamentoDePessoas.exception.PessoaNotFoundExcetion;
import com.dio.gerenciamentoDePessoas.mapper.PessoaMapper;
import com.dio.gerenciamentoDePessoas.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaService {

    private PessoaRepository pessoaRepository;

    final PessoaMapper pessoaMapper = PessoaMapper.INSTANCE;

    //inserir
    public Pessoa create(PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaMapper.toModel(pessoaDTO);
        return pessoaRepository.save(pessoa);
    }

    //alterar
    public Pessoa update(PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaMapper.toModel(pessoaDTO);
        return pessoaRepository.save(pessoa);
    }

    //excluir
    public void delete(Long id) throws PessoaNotFoundExcetion {
        verificaSeExiste(id);
        pessoaRepository.deleteById(id);
    }

    //buscar todos
    public List<PessoaDTO> findAll(){
        List<Pessoa> lista = pessoaRepository.findAll();
        return lista.stream()
                .map(pessoaMapper::toDTO)
                .collect(Collectors.toList());
    }

    //buscar por id
    public PessoaDTO findById(Long id) throws PessoaNotFoundExcetion {
        Pessoa pessoa = verificaSeExiste(id);
        return pessoaMapper.toDTO(pessoa);
    }

    //verificar se pessoa existe
    public Pessoa verificaSeExiste(Long id) throws PessoaNotFoundExcetion {
        return pessoaRepository.findById(id).orElseThrow(
                () -> new PessoaNotFoundExcetion(id)
        );
    }
}

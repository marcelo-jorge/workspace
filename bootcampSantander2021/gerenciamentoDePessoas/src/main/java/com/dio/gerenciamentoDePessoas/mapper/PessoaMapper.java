package com.dio.gerenciamentoDePessoas.mapper;

import com.dio.gerenciamentoDePessoas.dto.PessoaDTO;
import com.dio.gerenciamentoDePessoas.entity.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @Mapping(target = "dataDeNascimento", source = "dataDeNascimento", dateFormat = "dd-MM-yyyy")
    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);
}

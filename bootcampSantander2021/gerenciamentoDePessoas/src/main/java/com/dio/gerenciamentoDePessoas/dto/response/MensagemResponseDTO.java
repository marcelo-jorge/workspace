package com.dio.gerenciamentoDePessoas.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MensagemResponseDTO {
    private String mensagem;
}

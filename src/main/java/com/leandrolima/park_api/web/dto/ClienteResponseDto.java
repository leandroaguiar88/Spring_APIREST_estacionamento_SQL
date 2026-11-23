package com.leandrolima.park_api.web.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClienteResponseDto {
    private Long id;
    private String nome;
    private String cpf;

}

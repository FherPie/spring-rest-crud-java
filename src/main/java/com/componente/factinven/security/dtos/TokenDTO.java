package com.componente.factinven.security.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TokenDTO {

    private String token;
    private LocalDateTime expiry;
    private UserDTO user;
}

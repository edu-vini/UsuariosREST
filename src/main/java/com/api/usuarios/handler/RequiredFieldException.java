package com.api.usuarios.handler;

public class RequiredFieldException extends BusinessException {

    public RequiredFieldException(String campo) {
        super(String.format("Campo %s é obrigatório!", campo));
    }
}

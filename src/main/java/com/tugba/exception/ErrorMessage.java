package com.tugba.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // get - set - to string
@AllArgsConstructor // parametreli consturctorların tümü
@NoArgsConstructor // default constructor
@Builder //
public class ErrorMessage {
    private Integer code;
    private String message;
    /**
     * String password: @Valid, min=8 , max=32, En az bir byük harf, küçük harf ve özel karakter olmalı
     */
    private List<String> fields;
}

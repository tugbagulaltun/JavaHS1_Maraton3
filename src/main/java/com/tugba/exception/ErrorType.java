package com.tugba.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {
    BAD_REQUEST_ERROR(1001, "Girilen bilgiler eksik/yanlıştır.",HttpStatus.BAD_REQUEST),
    INTERNEL_SERVER_ERROR(9998,"Sunucuda beklenmeyen bir hata oluştu, tekrar deneyiniz." ,HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR_NOR_FOUND_DATA(1002, "Liste getirilemedi, tekrar deneyiniz.",HttpStatus.INTERNAL_SERVER_ERROR);

    private Integer code;
    private String message;
    private HttpStatus httpStatus;
}

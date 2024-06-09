package com.tugba.exception;

import lombok.Getter;

/**
 * Bir sınıfın Exception sınıfı olarak göre yapabilmesi için Exception ya da RunTimeException'dan miras alması gerekir.
 * Eğer hata mesajını fırşatmak ve işetmek isteniyorsa miras aldığınız sınıfın
 * constructor'ında (super) hata ile ilgili mesajınızı iletiyorsunuz.
 */
@Getter
public class ETicaretException extends RuntimeException{
    private ErrorType errorType;
    public ETicaretException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

}

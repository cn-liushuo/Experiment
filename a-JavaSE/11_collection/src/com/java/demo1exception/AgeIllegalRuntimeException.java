package com.java.demo1exception;

/*
 * 自定义的运行时异常
 * 1、RuntimeException
 * 2、RuntimeException
 * 3、哪里需要用这个异常返回，哪里就throw
 * */
public class AgeIllegalRuntimeException extends RuntimeException {
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}

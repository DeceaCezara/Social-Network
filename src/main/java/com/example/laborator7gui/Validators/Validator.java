package com.example.laborator7gui.Validators;

@FunctionalInterface
public interface Validator<T> {
    void validate(T entity) throws ValidException;
}
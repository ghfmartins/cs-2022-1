package org.program4;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super("Saldo insuficiente para realizar a operação!");
    }
}

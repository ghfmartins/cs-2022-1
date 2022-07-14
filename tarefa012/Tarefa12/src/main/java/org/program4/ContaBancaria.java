package org.program4;

public class ContaBancaria {

    private double saldo;

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public boolean sacar(Double valor) throws SaldoInsuficienteException {
        if( valor > this.saldo)
            throw new SaldoInsuficienteException();

        this.saldo -= valor;
        return true;
    }
}

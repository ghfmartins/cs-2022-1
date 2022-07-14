package org.program4;

import javax.sound.midi.Soundbank;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try{
            conta.depositar(1000.0);
            conta.depositar(300.0);
            conta.sacar(100.0);
            conta.depositar(20.90);
            conta.sacar(2000.0);

            System.out.println("Operações realizadas com sucesso!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

package org.program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int valor, resultado, i = 0;
        System.out.println("Informe 10 valores inteiro para o vetor..");
        try{
            do {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                arr[i] = valor;
                i++;
            } while(valor != 0);

            for (int j = 0; arr[j] != 0; j++){
                System.out.print(arr[j] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ERRO - Foram informados mais de 10 valores");
        } catch (InputMismatchException ex) {
            System.out.println("ERRO - Valor informado não é um inteiro");
        }
    }
}

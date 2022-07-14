package org.program1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resultado;

        try {
            System.out.println("Informe os valores de números inteiros:");
            System.out.print("Dividendo: ");
            num1 = sc.nextInt();
            System.out.print("Divisor: ");
            num2 = sc.nextInt();
            resultado = num1/num2;
            System.out.println("Resultado = " + resultado);

        } catch (ArithmeticException ex) {
            System.out.println("ERRO - Não é possível realizar divisão por zero");
        } catch (InputMismatchException  ex){
            System.out.println("ERRO - Valor digitado não é um numero inteiro!");
        }
    }
}
package org.Program3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Reajuste de 15% = " + saldo*1.15);
    }
}

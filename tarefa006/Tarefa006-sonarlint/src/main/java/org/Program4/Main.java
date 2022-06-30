package org.Program4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peca peca1 = new Peca();
        Peca peca2 = new Peca();
        final int IPI = 17;

        System.out.println("Informe os dados da primeira peça: ");
        System.out.println("Código da peça: ");
        peca1.codigo = sc.nextInt();
        System.out.println("Valor da peça:");
        peca1.valorUnitario = sc.nextDouble();
        System.out.println("Quantidade da peça:");
        peca1.quantidade = sc.nextInt();

        System.out.println("Informe os dados da segunda peça: ");
        System.out.println("Código da peça: ");
        peca2.codigo = sc.nextInt();
        System.out.println("Valor da peça:");
        peca2.valorUnitario = sc.nextDouble();
        System.out.println("Quantidade da peça:");
        peca2.quantidade = sc.nextInt();

        var resultado = (peca1.valorUnitario*peca1.quantidade + peca2.valorUnitario*peca2.quantidade) * (IPI/100 + 1);

        System.out.println("Valor total = R$" + resultado);
    }
}

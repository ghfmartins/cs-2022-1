package org.exercicio1;

import java.util.Stack;

public class QuickSortIterativo extends SortBasics {
    public static void QuickSort(int[] a, int tamanho)
    {
        Stack<Pair> stack = new Stack<>();

        int inicio = 0;
        int fim = tamanho;

        stack.push(new Pair(inicio, fim));

        while (!stack.empty())
        {
            inicio = stack.peek().getX();
            fim = stack.peek().getY();
            stack.pop();

            int pivot = partition(a, inicio, fim);

            if (pivot - 1 > inicio) {
                stack.push(new Pair(inicio, pivot - 1));
            }

            if (pivot + 1 < fim) {
                stack.push(new Pair(pivot + 1, fim));
            }
        }
    }
}

package org.exercicio1;

public class QuickSortRecursivo extends SortBasics{
    public static void QuickSort(int[] arr, int inicio, int fim)
    {
        if(fim > inicio) {
            int index = partition(arr, inicio, fim);

            QuickSort(arr, inicio, index - 1);
            QuickSort(arr, index + 1, fim);
        }
    }
}

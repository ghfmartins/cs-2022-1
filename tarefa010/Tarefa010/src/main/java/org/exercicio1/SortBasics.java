package org.exercicio1;

public abstract class SortBasics {

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int inicio, int fim)
    {
        int pivot, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivot = arr[inicio];

        while(pontEsq <= pontDir) {
            while(pontEsq <= pontDir && arr[pontEsq] <= pivot) {
                pontEsq++;
            }

            while(pontDir >= pontEsq && arr[pontDir] > pivot) {
                pontDir--;
            }

            if(pontEsq < pontDir) {
                swap(arr, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        swap(arr, inicio, pontDir);
        return pontDir;
    }

    public static class Pair
    {
        private final int x;
        private final int y;

        Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }
    }
}

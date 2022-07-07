package org.exercicio1;

import java.util.Random;

public class Main {
    public static int[] PreencherArray( int tamanho){
        Random gerador = new Random();
        int[] arr = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
             arr[i] = gerador.nextInt(10000);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arrCem = PreencherArray(100);
        int[] arrMil = PreencherArray(1000);
        int[] arrDezMil = PreencherArray(10000);

        //Array de cem QS recursivo
        long tempoInicial = System.currentTimeMillis();
        QuickSortRecursivo.QuickSort(arrCem, 0, arrCem.length-1);
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Recursivo array de cem = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        //Array de cem QS iterativo
        tempoInicial = System.currentTimeMillis();
        QuickSortIterativo.QuickSort(arrCem, arrCem.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Iterativo array de cem = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        //Array de mil QS recursivo
        tempoInicial = System.currentTimeMillis();
        QuickSortRecursivo.QuickSort(arrMil, 0, arrMil.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Recursivo array de mil = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        //Array de mil QS iterativo
        tempoInicial = System.currentTimeMillis();
        QuickSortIterativo.QuickSort(arrMil, arrMil.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Iterativo array de mil = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        //Array de dez mil QS recursivo
        tempoInicial = System.currentTimeMillis();
        QuickSortRecursivo.QuickSort(arrDezMil, 0, arrDezMil.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Recursivo array de dez mil = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

        //Array de cem QS iterativo
        tempoInicial = System.currentTimeMillis();
        QuickSortIterativo.QuickSort(arrDezMil, arrDezMil.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.printf("QuickSort Iterativo array de dez mil = %.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
    }
}
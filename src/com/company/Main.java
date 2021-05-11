package com.company;



public class Main {

    static void printDistinct(int arr[], int n) {
        for (int i = 0; i < n; i++) {

            while (i < n - 1 && arr[i] == arr[i + 1])
                i++;

            System.out.print(arr[i] +" ");
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {3,6,8,3,2,7,9,9};
        int n = arr.length;
        printDistinct(arr, n);// сложность  алгоритма  O(n *(n-1))

    }

}



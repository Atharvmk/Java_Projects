package com.company;
public class Quick_Sort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;
//                Swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
//        Swapping
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // Pivot Index
    }
    public static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pivotidx = partition(arr, low, high);
            quickSort(arr, low, pivotidx-1);
            quickSort(arr, pivotidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 9, 6, 4, 2, 0};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
/*
Time Complxity
Worst Case- O(n^2)
 */

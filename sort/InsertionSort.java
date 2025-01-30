// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// start from left if it is greater than right swap it....
import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = new int[]{12,93,4,45,48,56};
        printArray(arr);
        printArray(insertionSort(arr,arr.length));
    }
    
    public static int[]  insertionSort(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            for(int j = i+1; j< n;j++) {
                if(arr[i]>arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }
    
    public static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// find minimum then swap with first index and so on...
import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = new int[]{12,93,4,45,48,56};
        printArray(arr);
        printArray(selectionSort(arr,arr.length));
    }
    
    public static int[] selectionSort(int[] arr ,int n) {
        int c = 0, min = Integer.MAX_VALUE;
        while(c<n) {
            min = findMinimum(arr,c,n);
            System.out.println(min);
            swap(arr,c,min);
            c++;
        }
        return arr;
    }
    
    public static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int findMinimum(int[] arr,int s,int n) {
        int min = Integer.MAX_VALUE,minIndex = 0;
        for(int i =s; i<n;i++){
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
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

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = new int[]{12,13,14,45,48,56};
        System.out.println(binarySearch(arr, 45,0,5));
    }
    
    public static int linearSearch(int[] arr, int k) {
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int k,int s,int end) {
       
        int m = (s+end)/2 + 1;
        if(k == arr[m]) return m;
        else if(k < arr[m]) {
            end = m-1;
            return binarySearch(arr,k,s,end);
        } else if( k > arr[m]) {
            s= m+1;
            return binarySearch(arr,k,s,end);
        }
        return -1;
    }
    
    public static int  binarySearch(int[] arr, int k,int s,int end) {
        
    }
}

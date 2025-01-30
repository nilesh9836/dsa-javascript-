// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//select smallest and swap with first index and so on....
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = new int[]{12,13,14,45,48,56};
        System.out.println(binarySearch(arr, 45,0,5));
        System.out.println(binarySearchIteration(arr, 45));
    }
    
    public static int linearSearch(int[] arr, int k) {
        for(int i = 0; i<arr.length;i++) {
            if(arr[i] == k) return i;
        }
        return -1;
    }
    public static int binarySearchIteration(int[] arr,int k) {
        int l=0, r= arr.length;
        int m = (l+r)/2;
        while(l<=r) {
            if(k<arr[m]) {
                r=m-1;
            } else if(k>arr[m]) {
                l = m+1;
            } else if(k == arr[m]) {
                return m;
            }
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
    
}

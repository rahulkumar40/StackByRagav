package TrapingRainWater;
// import java.lang.*;
import java.util.logging.*;
public class Ok {
    public static void printA(int arr[]){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println( );
    }
    public static int min(int i, int j){
        if(i<j){
            return i;
        }
        else return j;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 0, 1, 3, 2};
        int n = arr.length; 
        int left [] = new int[n];
        printA(arr);
        int max = arr[0];
        left[0] = arr[0];
        System.out.println();
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            left[i] = max;
        }
        printA(left);
        int right [] = new int[n];
        System.out.println( );
        printA(arr);
        int minn= arr[n-1];
        right[n-1] = minn;
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=minn){
                minn=arr[i];
            }
            right[i] = minn;
        }
        printA(right);
        int m = 0;
        // System.out.println(min(8, 4));
        for(int i=0; i<n; i++){
            m = min(left[i], right[i]) - arr[i];
            arr[i] = m;
        }
        printA(left);
        printA(right);
        printA(arr);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println("Trapping Water Value :: " + sum);
        
    }
}

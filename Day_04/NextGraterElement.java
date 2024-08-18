package Day_04;

import java.util.Stack;

public class NextGraterElement {
    public static void print(int arr[]){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println( );
    }
    public static void nextGrater(int arr[]){
        int n = arr.length; 
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(ans[n-1]);
        ans[n-1] = -1;
        for(int i= n-2; i>=0; i--){
            while (!st.isEmpty() && st.peek() < arr[i] ) {
                    st.pop();
                
            }
            if(st.size()==0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
         st.push(arr[i]);
         System.out.println(st);
        }   
}
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 3, 4, 8, 19, 34};
        int ans[] = new int[arr.length];
        int n = arr.length; 
        print(arr);
        for(int i=0; i<n ; i++){
            ans[i] = -1;
        }
        print(ans);
        nextGrater(arr);
        // next grater element with brute force. 
        // with the help of nested loop.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j]> arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        print(ans);
        nextGrater(arr);
        print(arr);


    }
}

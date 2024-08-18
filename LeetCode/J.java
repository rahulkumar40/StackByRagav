package LeetCode;

import java.util.Stack;

public class J {
    public static void last(int arr[]){
        Stack<Integer> st = new Stack<>();

        int n = arr.length; 
        int ans[] = new int[n];
        int id[] = new int[n];
        int idx = n;

        st.push(arr[n-1]);
        ans[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            while (!st.isEmpty() && st.peek()>arr[i]) {
                st.pop();
                idx =i;
            }
            if(st.size()==0){
                ans[i] = 0;
                id[i] = -1;
            }
            else if(st.peek()<arr[i] ){
                ans[i] = st.peek();
                id[i] = i;
                // idx--;
            }
            st.push(arr[i]);
        }
        System.out.println(st);
        for(int i: ans){
            System.out.print(i + " ");
        }
        System.out.println();
        // for(int i: id){
        //     System.out.print(i + " ");
        // }
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 6, 3, 6 };
        last(arr);
    }
}

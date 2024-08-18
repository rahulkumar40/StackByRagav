package Practice_02;

import java.util.Stack;

public class PreviouseGreatest_01 {
    public static void p(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length; 
        int ans[] = new int[n];
        ans[0] = -1;
        st.push(arr[0]); 
        for(int i=1; i<n;  i++){
            while(!st.isEmpty() && st.peek() <arr[i] ){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
            System.out.println(st);
        }
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        p(arr);

    }
}

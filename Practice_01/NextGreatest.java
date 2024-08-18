package Practice_01;

import java.util.Stack;

public class NextGreatest {
    public static void n(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n]; 
        st.push(arr[n-1]) ;
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);

        }
        System.out.println(st);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {1, 5, 3, 2, 1, 6, 3, 4}; //----> 5 6 6 6 6 -1 4 -1 
        // int[] arr= {1, 3, 2, 1, 8, 6, 3, 4};

            n(arr);
        }
}

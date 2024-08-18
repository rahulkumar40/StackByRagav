package Day_04;

import java.util.Stack;

public class PreviouseGretest_02 {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85, 200, 4};
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = -1;
        st.push(arr[0]);
        System.out.println(st);
        for(int i=1; i<n; i++){
            while(arr[i] >=st.peek() && !st.isEmpty()){
                st.pop();
            }
            if(st.isEmpty()) arr[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
            System.out.println(st);
        }
        System.out.println(st);
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}

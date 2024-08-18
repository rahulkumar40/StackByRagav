package Practice_02;

import java.util.Stack;

public class StockSpan_02 {
    public static int[] p(int arr[]){
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
            // System.out.println(st);
        }
        return ans;
    }
    public static void pirnt(int arr[]){
        for(int i: arr){
            System.out.print(i +  " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        pirnt(arr);
        int pre[] =  p(arr);
        pirnt(pre);

        int n = arr.length;
        int r[] = new int[n];
        r[0] = 1;
        int mn = 0;

        for(int i=1; i<n; i++){
            if(i<n-1 && pre[i] != pre[i+1]){
                r[i] = i-mn;
            }
            else{
                if(i<n-1 && pre[i]>pre[i+1] && pre[i]>arr[i]){
                    mn++;
                }
                r[i] = i-mn;
            }

        }
        pirnt(r);


    }
}


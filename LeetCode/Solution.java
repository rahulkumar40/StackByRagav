package LeetCode;
import java.util.*;
public class Solution {

    public static void last(int arr[]){
            Stack<Integer> st = new Stack<>();
            int n = arr.length; 
            int ans[] = new int[n];
            int pre[] = new int[n];

            st.push(n-1);
            ans[n-1] = n;
            for(int i=n-2; i>=0; i--){
                while (!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                    st.pop();
                }
                if(st.size()==0)ans[i] = n;
                else  ans[i] = st.peek();
                // st.push(arr[i]);
                st.push(i);
            }
            // emptying the stack 
            while(st.size()>0) st.pop();
            // System.out.println(st);
            print(ans);
            // calculating previouse stack.

            st.push(0);
            pre[0] = -1;
            for(int i=1; i<n; i++){
                while (!st.isEmpty() && arr[st.peek()] >=arr[i]) {
                    st.pop();
                }
                if(st.size()== 0) pre[i] = -1; 
                else pre[i] = st.peek();
                st.push(i);
            }
            print(pre);
            // maximum area of ractangle
            int max = -1;
            for(int i=0; i<n; i++){
                int area = arr[i] *(ans[i]-pre[i]-2);
                max = Math.max(max, area);
            }
            System.out.println(max);
        }
        public static void print(int arr[]){
            for(int i: arr){
                System.out.print(i + " ");
            }
            System.out.println( );
        }
        public static void main(String[] args) {
            // int arr[] = {5, 2, 4, 6, 3, 6 };
            int arr[] = {1,1 };

            last(arr);
            
        }
    }


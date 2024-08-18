package Day_01;

import java.util.*;

public class DisplayStack_04 {
    public static void display(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (st.size()!=0) {
            temp.push(st.pop());
        }
        // while (temp.size()!=0) { // !=0 or >0
        //     System.out.print(temp.peek() + " ");
        //     st.push(temp.pop());
        // }
        while (temp.size()!=0) { // !=0 or >0
            int x = temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println( );
    }

    public static void disArr(Stack<Integer> st){
        int n = st.size();
        int arr[] = new int[n];
        for(int i = n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println( );
        display(st);

        System.out.println(st);
        disArr(st);
        
    }
}               

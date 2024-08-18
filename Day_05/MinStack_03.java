package Day_05;

import java.util.Stack;

public class MinStack_03 {
    static int minS(Stack<Integer> st){
        int mn = 585;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0) {
            if(st.peek() < mn){
                mn = st.peek();
            }
            temp.push(st.pop());
        }
        return mn;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(3);
        // System.out.println(minS(st));
        st.push(1);
        // System.out.println(minS(st));

        st.push(2);
        // System.out.println(minS(st));

        st.push(-2);
        System.out.println(minS(st));

    }
}

package HomeWork;

import java.util.Stack;

public class pushAtReverseStack_02 {
    public static void reveseStack(Stack<Integer> st, int val){
        if(st.size() == 0) {
            st.push(val);
            return;
        }
        int x = st.pop();
        reveseStack(st, val);
        st.push(x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        reveseStack(st,433 );
        System.out.println(st);
    }
}

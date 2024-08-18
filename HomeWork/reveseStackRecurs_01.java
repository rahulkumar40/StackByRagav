package HomeWork;

import java.util.Stack;

public class reveseStackRecurs_01 {
    public static void pushAtBottom(Stack<Integer> st , int val){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
    }
    public static void reveseStack(Stack<Integer> st){
        if(st.size() == 1) {
            return;
        }
        int top = st.pop();
        reveseStack(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reveseStack(st);
        System.out.println(st);
    }
}

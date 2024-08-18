package Day_01;

import java.util.Stack;

public class DisplayRecursively_05 {
    void disRecursive(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        disRecursive(st);
        System.out.print(x + " ");
        st.push(x);
    }
    void reverseRecursive(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        System.out.print(x + " ");
        disRecursive(st);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        DisplayRecursively_05 t = new DisplayRecursively_05();
        System.out.println(st);
        t.disRecursive(st);
        System.out.println(st);
        t.reverseRecursive(st);
        System.out.println(st);
    }
}

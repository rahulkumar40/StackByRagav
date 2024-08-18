package HomeWork;

import java.util.Stack;

public class RemoveAtIdx0rAny_03 {
    public static void removeBottom(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=1){
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()!=0) {
            st.push(temp.pop());
        }

    }
    public static void removeAtIdx(Stack<Integer> st, int idx){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=idx){
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()!=0) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        removeBottom(st);
        System.out.println(st);

        removeAtIdx(st, 3);
        System.out.println(st);
        System.out.println("Size of Stack :: "+st.size());
        st.push(84);
        st.push(840);
        st.push(814);
        System.out.println(st);
    }
}

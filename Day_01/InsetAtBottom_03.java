package Day_01;

import java.util.Stack;

/**
 * InsetAtBottom_03
 */
public class InsetAtBottom_03 {
    public static void insertAtBottom(Stack<Integer> st , int val){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
    }
    public static void insertAtIdx(Stack<Integer> st , int val, int idx){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()!=0){
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
        System.out.println(st.size());
        System.out.println( );
        insertAtBottom(st, 4837);
        System.out.println(st);
        System.out.println(st.size());
        insertAtIdx(st, 3748, 3);
        System.out.println(st);
    }
    
}
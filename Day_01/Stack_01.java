package Day_01;

import java.util.*;
public class Stack_01 {
    public static void display(Stack<Integer> st){
        while(st.size()!=0){
            System.out.print(st.pop() + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack         :: "+ st);
        System.out.println( );
        System.out.println("Size of Stack :: "+st.size());
        System.out.println();
        System.out.println("Stack Peek    :: "+st.peek());
        System.out.println( );

        System.out.println("Stack         :: "+ st);
        System.out.println( );
        System.out.println("POP() Stack :: "+st.pop());
        System.out.println();
        System.out.println("Stack         :: "+ st);
        System.out.println( );
        display(st);

        System.out.println("is empty :: "+ st.isEmpty());
    }
}

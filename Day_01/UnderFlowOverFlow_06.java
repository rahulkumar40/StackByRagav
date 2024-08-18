package Day_01;

import java.util.Stack;

public class UnderFlowOverFlow_06 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        for(int i=0; i<5; i++){
            System.out.println(st);
            st.pop();
        }
                    // [10, 20, 30, 40, 50]
                    // [10, 20, 30, 40]
                    // [10, 20, 30]
                    // [10, 20]
                    // [10]
                    // []
        System.out.println(st); // []
        st.pop(); // error
        System.out.println(st);
        /*
         * Exception in thread "main" java.util.EmptyStackException
        at java.base/java.util.Stack.peek(Stack.java:103)     
        at java.base/java.util.Stack.pop(Stack.java:85)       
        at Day_01.UnderFlowOverFlow_06.main(UnderFlowOverFlow_06.java:24)
         */
    }
}

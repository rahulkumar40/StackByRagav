package Day_03;

import java.util.Stack;

public class MinOfLeft_03 {
    public static void left(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int count = 0;
        // if(s.charAt(0)==')') st.push(s.charAt(0));
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(!st.isEmpty() && st.peek()=='(' && ch == ')'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            System.out.println(st);
        }
        System.out.println(st.size());
        System.out.println(st);
    }
    public static void main(String[] args) {
        String s = "(()()()";
        left(s);

    }
}

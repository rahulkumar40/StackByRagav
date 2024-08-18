package Day_05;

import java.util.Stack;

public class ValidParenthasis_02 {
    public static void valid(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length(); 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(' ||ch=='[' ||ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && st.peek()=='('&& ch ==')') st.pop();
                else if(!st.isEmpty() && st.peek()=='{'&& ch =='}') st.pop();
                else if(!st.isEmpty() && st.peek()=='['&& ch ==']') st.pop();
                else{
                    st.push(ch);
                }
            }
            if(st.size()>0) System.out.println("String is not valid");
            else System.out.println("Stack is valid");
            System.out.println(st);
        }
    }
    public static void main(String[] args) {
        String s = "(){}[{()}]";
        valid(s);
    }
}

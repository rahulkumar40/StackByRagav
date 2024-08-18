package Practice_01;

import java.util.Stack;

public class BalanceBractes_01 {
    public static void bal(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(s.charAt(0)==')'){
            System.out.println("False");
            return;
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()==0){            // if this line is not then ')' ans will always incorrect.
                    System.out.println("Fasle");
                    return;
                }
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
            }
            System.out.println(st);
            System.out.println("Size of st : "+st.size());
        }
        if(st.size()>0) System.out.println("Stack is Not");
        else System.out.println("Stack is Ok");
        System.out.println(st);
    }
    public static void main(String[] args) {
        String s = "()())";
        bal(s);
    }
}

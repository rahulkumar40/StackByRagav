package Day_03;

import java.util.*;
public class BalancedBrackest_01 {
    public static boolean balancedBracket(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length(); 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else { // ch == ')'
                if(st.size() == 0 ) return true;
                if(st.peek()==')'){
                    st.pop();
                }
            }

        }
        System.out.println(st.size());
        if(st.size()>0) return false; 
        else return true;
    }
    public static boolean a(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                // if(st.size()==0) continue;
                if(st.peek()=='(') st.pop();
            }
        }
        System.out.println("Size of error ( ) :: "+ (st.size()));
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "(()))";
        int n = s.length();
        System.out.println(n);
        System.out.println(a(s));
        // int i = 0;
        // boolean flag = true;
        // while(i<n){
        //     char ch = s.charAt(i);
        //     // System.out.print(ch + " ");
        //     i++;
        //     if(ch=='(') st.push(')');
        //     else if(ch=='[') st.push(']');
        //     else if(ch=='{') st.push('}');
        //     // else if(ch=='(') st.push(')');
        //     else if(!st.isEmpty() && ch!=st.pop()){
        //         st.pop();
        //     }
        //     System.out.print(st+ " ");
        // }
        // System.out.println(st.isEmpty());
    }
}

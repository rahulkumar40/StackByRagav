package Day_03;

import java.util.Stack;

/**
 * LeetCode_20
 */
public class LeetCode_20 { 
    public static boolean checkBalancedBrac(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length(); 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i) ;
            if(ch=='(' ||ch=='{' || ch=='[' ){
                st.push(ch);
            }
            else{
                if(st.size()==0) return true;
                if(st.peek()!='(' || st.peek()=='}' ){
                    
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "({[]})[]";

        boolean x = checkBalancedBrac(s);
        System.out.println(x);
    }
}
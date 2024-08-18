package Practice_01;

import java.util.Stack;

public class ValidParenthesis_03 {
    public static void c(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[') st.push(ch);
            else{
                if( !st.isEmpty() && st.peek()=='('&& ch==')') st.pop();
                else if( !st.isEmpty() && st.peek()=='['&& ch==']') st.pop();
                else if( !st.isEmpty() && st.peek()=='{'&& ch=='}') st.pop();
                else{
                    st.push(ch);
                }
            }
            System.out.println(st);
        }
        if(st.size()>0) System.out.println("Nooooo!");
        else System.out.println("Yessssss!");
    }
    public static void main(String[] args) {
        String s = "}({[]}){}}";
        c(s);
    }
}

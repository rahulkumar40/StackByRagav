package Practice_01;

import java.util.Stack;

public class CountBractesToBal_02 {
    public static void check(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length(); 
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(!st.isEmpty() && ch==')' && st.peek()=='(' ){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            System.out.println(st);
        }
        System.out.println("Anser :: ");
        System.out.println(st.size());
    }
    public static void main(String[] args) {
        String s = ")(()))())())(()";
        check(s);

    }
}

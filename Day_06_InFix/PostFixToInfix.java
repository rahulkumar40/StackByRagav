package Day_06_InFix;

import java.util.Stack;

public class PostFixToInfix {
  public static void main(String[] args) {
    String s = "953+4*6/-";
    Stack<String> st = new Stack<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      int ascii = (int)ch;
      if(ascii>=48 && ascii<=57){
        String tt = "" + ch;
        st.push(tt);
      }
      else{
        String v2 = st.pop();
        String v1 = st.pop();
        char op = ch;
        // v1 op v2 
        String t ="("+  v1 + op + v2 +")";
        st.push(t);
      }
      System.out.println(st);
    }
    System.out.println(st.peek());
  }
}

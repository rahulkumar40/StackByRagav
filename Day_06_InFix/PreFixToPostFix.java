package Day_06_InFix;

import java.util.Stack;

public class PreFixToPostFix {
  public static void main(String[] args) {
    String s = "-9/*+5346";
    Stack<String> st = new Stack<>();
    for(int i=s.length()-1; i>=0; i--){
      char ch = s.charAt(i);
      int ascii = (int)ch;
      if(ascii>=48 && ascii<=57) {
        String r = "" + ch;
        st.push(r);
      }
      else{
        String v1 = st.pop();
        String v2 = st.pop();
        String o = "" + ch;
        // if(ch=='+') st.push(v1+v2+o);
        // if(ch=='-') st.push(v1+v2+o);
        // if(ch=='*') st.push(v1+v2+o);
        // if(ch=='/') st.push(v1+v2+o);
        st.push(v1+v2+o);
      }
      System.out.println(st);
    }
    System.out.println(st.peek());
  }
}

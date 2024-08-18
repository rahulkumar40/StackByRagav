package Day_06_InFix;

import java.util.Stack;

public class PostFixToPreFix {
  public static void main(String[] args) {
    String s = "953+4*6/-";
    Stack<String> st = new Stack<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      int ascii = (int) ch;
      if(ascii>=48 && ascii<=57){
        String em = "" + ch;
        st.push(em);
      }
      else{
        String v2 = st.pop();
        String v1 = st.pop();
        String o = "" + ch;
        st.push(o + v1 + v2);
      }
      System.out.println(st);
    }
    System.out.println(st.peek());
  }
}

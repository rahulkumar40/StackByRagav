package Day_06_InFix;

import java.util.Stack;

public class PreFixEvalution {
  public static void main(String[] args) {
    String s = "-9/*+5346";
    Stack<Integer> st = new Stack<>();
    for(int i=s.length() -1; i>=0; i--){
      char ch = s.charAt(i);
      int ascii = (int)ch;
      if(ascii>=48 && ascii<=57) st.push((int)ch-48);
      else{
        int v1 = st.pop();
        int v2 = st.pop();
        if(ch=='+') st.push(v1+v2);
        if(ch=='-') st.push(v1-v2);
        if(ch=='*') st.push(v1*v2);
        if(ch=='/') st.push(v1/v2);
      }
      System.out.println(st);

    }
    System.out.println(st.peek());
  }
}

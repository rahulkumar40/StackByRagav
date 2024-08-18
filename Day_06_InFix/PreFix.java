package Day_06_InFix;

import java.util.Stack;

public class PreFix {
      public static void main(String[] args) {
        String str =   "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
              String s = "" +ch;
              val.push(s);
            } 
            else if(op.size()==0 || ch=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    // push
                    val.push(t);
                }
                op.pop();
              }
              else{
                    if (op.peek()=='*' || op.peek()=='/') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);


                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        while (val.size()>1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
}
}

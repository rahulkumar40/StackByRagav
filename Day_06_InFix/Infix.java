package Day_06_InFix;
import java.util.*;
public class Infix {
    public static void main(String[] args) {
        String str =   " 3+5 / 2 ";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if(op.size()==0) op.push(ch);
            else{
                if(ch=='+' || ch=='-'){
                    // work
                    // if(op.peek()=)
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push((v1-v2));
                    if(op.peek()=='+') val.push((v1+v2));
                    if(op.peek()=='*') val.push((v1*v2));
                    if(op.peek()=='/') val.push((v1/v2));
                    op.pop();
                    // push
                    op.push(ch);
                }
                else if(ch=='*'|| ch=='/'){
                    if (op.peek()=='*' || op.peek()=='/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push((v1*v2));
                        if(op.peek()=='/') val.push((v1/v2));
                        op.pop();
                        // push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (val.size()>1) { // kam krna hai.
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}

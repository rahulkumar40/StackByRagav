package Day_01;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n ;
        System.out.println("Enter the elements : ");
        n = sc.nextInt();
        System.out.println("Enter the element : ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        while (st.size()!=0) {
            temp.push(st.pop());
        }

        System.out.println( );
        System.out.println(temp);
        System.out.println();
        Stack<Integer> originalOrder = new Stack<>();
        while (temp.size()!=0) {
            originalOrder.push(temp.pop());
        }
        System.out.println(originalOrder);
    }
}

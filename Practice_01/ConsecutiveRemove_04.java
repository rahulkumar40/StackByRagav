package Practice_01;
import java.util.*;
public class ConsecutiveRemove_04 {
    public static void r(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if( !st.isEmpty() && st.peek()==arr[i]){
                if(i==n-1 && arr[i]!=arr[i+1]){
                    st.pop();
                }
                else{
                    
                }
            }
            System.out.println(st);

        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 5, 6, 7, 7, 9, 12, 12,  2, 2, 2 ,4};
        r(arr);
        
    }
}

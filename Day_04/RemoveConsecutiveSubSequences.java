package Day_04;

import java.util.Stack;

public class RemoveConsecutiveSubSequences {
    public static int[] remove(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length; 
        int i=0, j=1; 
        while (j<n) {
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                int c = j-i;
                if(c==1){
                    st.push(arr[i]);
                }
                i = j;
            }
        }
        if(j==n) st.push(arr[i]);
        System.out.println(st);
        int k = st.size();
        int ans [] = new int[k];
        i = 0;
        for( i= k-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println( );
    }
    public static int[] removeBySir(int arr[]){
        int n = arr.length; 
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size()==0) st.push(arr[i]);
            else if(st.peek()!=arr[i]) st.push(arr[i]);
            else if(arr[i] == st.peek()){
                if(arr[i]==arr[i+1]) continue;     //1 2 3 30 4 5 7 2 7 10 
                // if(i<n && arr[i]==arr[i+1]) continue; 
                if(i==n-1 || arr[i]!=arr[i+1]){   
                    st.pop();
                }
            }
        }
        int ans[] = new int[st.size()];
        int k = ans.length; 
        for(int i = k-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 30, 30, 30,30, 4, 4, 5, 7, 7, 2, 2, 7, 10};
        print(arr);
        int res[] = remove(arr);
        print(res);
        print(arr);
        int ress[] = removeBySir(arr);
        print(ress);
    }
}
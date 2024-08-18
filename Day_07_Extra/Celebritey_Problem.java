package Day_07_Extra;

import java.util.Stack;

public class Celebritey_Problem {
  public static int p(int arr[][], int n){
    Stack<Integer> st = new Stack<>();
    for(int i=0; i<n; i++){
      st.push(i);
    }
    while (st.size()>1) {
      int v1 = st.pop();
      int v2 = st.pop();
      if(arr[v1][v2]==0) {
        // shayd v1 celeb ho, v2 to celeb nhi hai
        st.push(v1);
      }
      else if(arr[v2][v1]==1){
        st.push(v2);
      }
    }
    if(st.size()==0) return -1;
    int potential = st.pop();
    for(int i=0; i<n; i++){
      if(arr[potential][i] == 1) return -1;
    }

    for(int i=0; i<n; i++){
      if(i==potential) continue;
      if(arr[i][potential]==0) return -1;
    }
    return potential;
  }
  public static void main(String[] args) {
    int arr[][] = {
      {0, 1, 0}, {0, 0, 0}, {0, 1, 0}
    };

    // p(arr, 3);
    System.out.println(p(arr, 3));
  }
}

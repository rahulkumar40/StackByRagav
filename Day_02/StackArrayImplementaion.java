package Day_02;

class StackA{
    private int[] arr= new int[40];
    private int idx = 0; // vvvv important.

    void push(int val){
        if(isFull()){
            System.out.println("Stack is full.");
            return;
        }
        arr[idx] = val;
        idx++;
    }
    int pop(){
        if(idx ==0) return -1;
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx --;
        return top;
    }
    void display(){
        for(int i=0; i<idx; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    int peek(){
        if(idx == 0) {
            isEmpty();
            return -1;
        }
        return arr[idx-1];
    }
    void size(){
        System.out.println(idx);
    }
    boolean isFull(){
        if(idx == arr.length) return true;
        return false;
    }
    boolean isEmpty(){
        if(idx == 0) return true;
        return false;
    }
    int capacity(){
        return arr.length; 
    }
}
public class StackArrayImplementaion {
    public static void main(String[] args) {
        StackA st = new StackA();
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        st.isEmpty();
        st.pop();
        st.pop();
        st.push(8948);
        st.push(473);
        st.push(4839);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.capacity());
        st.push(48);
        st.display();
        st.push(483);
    }
}

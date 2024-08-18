package Day_02;

class Node {
    int val ;
    Node next ;
    Node(int val){
        this.val = val;
    }
}
class StackK{
    Node head = null;
    int idx = 0;
    void push(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        idx++;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        int x = head.val;
        head = head.next;
        idx--;
        return x;
    }
    boolean isEmpty(){
        if(idx == 0) return true;
        else return false;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
public class StackLinkedListImplementaion {
    public static void main(String[] args) {
        StackK st = new StackK();
        st.push(19);
        st.push(19);
        st.push(9);
        st.display();
    }
}

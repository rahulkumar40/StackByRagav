import java.util.LinkedList;

// class Node{
//     int val;

//     Node next;
//     Node(int val){
//         this.val = val;
//     }
// }

// class SL{
//     Node head = null;
//     Node tail = null;
//     int idx = 0;
//     void push(int val){
//         Node temp = new Node(val);
//         if(head==null){
//             head = temp;
//         }
//         else{
//             head.next = temp;
//             temp = head;
//         }
//         idx++;
//     }
//     void display(){
//         Node temp = head;
//         while (temp!=null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//     }
// }
public class LinkedListKK {
    public static void main(String[] args) {
        // SL list = new SL();
        // list.push(4);
        // list.push(8);
        // list.display();
        // // System.out.println(SL);
        LinkedList<Integer>  st = new LinkedList<>();
        st.push(48);
        st.push(93);
        st.push(84);
        System.out.println(st);
        // System.out.println();
    }
}

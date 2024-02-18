//have better soln on leetcode 
// public class Test{
//     public static int flipper(String t){
//         char curr = '0';
//         int ct = 0;
//         for (int i=0;i<t.length();i++) {
//             if (t.charAt(i)!=curr) {
//                 ct++;
//                 curr = (char)(((curr + 1)%2)+48);
//             }
//         }
//         return ct;
//     }
 
//     public static void main(String args[]){
//         String t = "010110000000011111111111111111100101001010101111";
//         System.out.println(flipper(t));
//     }
// }

import java.util.*;
public class Test{
    public static class Node{
        int val;
        Node next;
        Node prev; 

        public Node(int v){
            this.val = v;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node addLast(Node head, int v){
        Node newNode = new Node(v);
        if(head==null){
            return newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }
    }

    public static void printer(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            curr.prev = nextNode;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public static void main(String args[]){
        Test ll = new Test();
        Node head = null;
        int arr[] = {1,3,5,7,29,11,63,12};
        for(int i=0;i<arr.length;i++){
            head = addLast(head, arr[i]);
        }
        printer(head);
        head = reverse(head);
        printer(head);

        // Node head = new Node(1);
        // head.next = new Node(3);
        // head.next.prev = head;
        // head.next.next = new Node(5);
        // head.next.next.prev = head.next;
        // head.next.next.next = new Node(7);
        // head.next.next.next.prev = head.next.next;
        // // null<-1<->3<->5<->7->null

        // //deleting first and last nodes pretty simple 
        // //delete node with val 3
        // Node temp = head;
        // Node prevN = null;
        // while(temp.val!=3 && temp!=null){
        //     prevN = temp;
        //     temp = temp.next;
        // }
        // prevN.next = temp.next;
        // prevN.next.prev = prevN;
        // temp.next = null;

        // printer(head);


    }
}
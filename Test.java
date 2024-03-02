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

// import java.util.*;
// public class Test{
//     public static class Node{
//         int val;
//         Node next;
//         Node prev; 

//         public Node(int v){
//             this.val = v;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node addLast(Node head, int v){
//         Node newNode = new Node(v);
//         if(head==null){
//             return newNode;
//         }else{
//             Node temp = head;
//             while(temp.next!=null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//             newNode.prev = temp;
//             return head;
//         }
//     }

//     public static void printer(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static Node reverse(Node head){
//         Node prev = null;
//         Node curr = head;

//         while(curr!=null){
//             Node nextNode = curr.next;
//             curr.next = prev;
//             curr.prev = nextNode;
//             prev = curr;
//             curr = nextNode;
//         }
//         return prev;
//     }
//     public static void main(String args[]){
//         Test ll = new Test();
//         Node head = null;
//         int arr[] = {1,3,5,7,29,11,63,12};
//         for(int i=0;i<arr.length;i++){
//             head = addLast(head, arr[i]);
//         }
//         printer(head);
//         head = reverse(head);
//         printer(head);

//         Node head = new Node(1);
//         head.next = new Node(3);
//         head.next.prev = head;
//         head.next.next = new Node(5);
//         head.next.next.prev = head.next;
//         head.next.next.next = new Node(7);
//         head.next.next.next.prev = head.next.next;
//         // null<-1<->3<->5<->7->null

//         //deleting first and last nodes pretty simple 
//         //delete node with val 3
//         Node temp = head;
//         Node prevN = null;
//         while(temp.val!=3 && temp!=null){
//             prevN = temp;
//             temp = temp.next;
//         }
//         prevN.next = temp.next;
//         prevN.next.prev = prevN;
//         temp.next = null;

//         printer(head);


//     }
// }

// import java.util.*;
// public class Test{
//     public static class Node{
//         int val;
//         Node next;
//         Node prev; 

//         public Node(int v){
//             this.val = v;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node addLast(Node head, int v){
//         Node newNode = new Node(v);
//         if(head==null){
//             return newNode;
//         }else{
//             Node temp = head;
//             while(temp.next!=null){
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//             newNode.prev = temp;
//             return head;
//         }
//     }

//     public static void printer(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static Node makeSortedList(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         Node temp = head;
//         Node nextNode;
//         while(temp!=null && temp.next!=null){
//             nextNode = temp.next;
//             while(nextNode!=null && nextNode.val==temp.val){
//                 nextNode = nextNode.next;
//             }
//             temp.next = nextNode;
//             if(nextNode!=null){
//                 nextNode.prev = temp;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }
    
//     public static void main(String args[]){
//         Test ll = new Test();
//         Node head = null;
//         int arr[] = {1,1,1,2,3,3,4};
//         for(int i=0;i<arr.length;i++){
//             head = addLast(head, arr[i]);
//         }
//         printer(head);
//         head = makeSortedList(head);
//         printer(head);
//     }
// }

//binary strings w/o consecutive ones
// import java.util.*;
// public class Test{
//     public static void recSoln(List<String> ans, int i, int N, String s){
//         if(i==N){
//             ans.add(s.toString());
//             return;
//         }

//         if(i==0){
//             recSoln(ans, i+1, N, s+"1");
//             recSoln(ans, i+1, N, s+"0");
//         }else{
//             char prev = s.charAt(i-1);
//             if(prev!='1'){
//                 recSoln(ans, i+1, N, s+"1");
//             }
//             recSoln(ans, i+1, N, s+"0");
//         }
//     }

//     public static List<String> generateString(int N){
//         List<String> ans = new ArrayList<>();
//         recSoln(ans, 0, N, new String(""));
//         return ans;
//     }
    
//     public static void main(String args[]){
//         int N = 3;
//         List<String> ans = generateString(N);
//         for(String s: ans){
//             System.out.print(s+" ");
//         }
//     }
// }

//more subsequence 
// 	Learn All Patterns of Subsequences …
// https://www.codingninjas.com/codestudio/problems/more-subsequence_8842355?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.*;

public class Test {
    public static void recSoln(int n, int i, String s, String o, List<String> ans) {
        if (i == n) {
            ans.add(s);
            return;
        }

        if (i == 0) {
            recSoln(n, i + 1, s + o.charAt(i), o, ans);
        } else {
            recSoln(n, i + 1, s, o, ans);
            recSoln(n, i + 1, s + o.charAt(i), o, ans);
        }
    }

    public static void main(String args[]) {
        int n = 2;
        int m = 2;
        String a = "ab";
        String b = "dd";

        List<String> subA = new ArrayList<>();
        recSoln(n, 0, "", a, subA);
        for(String s: subA){
            System.out.print(s+" ");
        }
        System.out.println();
        int ctA = subA.size();
        
        List<String> subB = new ArrayList<>();
        recSoln(m, 0, "", b, subB);
        for(String s: subB){
            System.out.print(s+" ");
        }
        System.out.println();
        int ctB = subB.size();
        
        if (ctA >= ctB) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}

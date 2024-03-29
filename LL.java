class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class LL{
    public static Node addLast(Node head, int num){
        Node newNode = new Node(num);
        if(head==null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public static void printer(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 3, 4, 5, 9};
        Node head = null;
        for(int i=0;i<5;i++){
            head = addLast(head, arr[i]);
        }        

        printer(head);
    }
}
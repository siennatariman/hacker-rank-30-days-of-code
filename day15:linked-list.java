import java.io.*;
import java.util.*;

class Node {
	int data; //integer data field
	Node next; // instance pointer 
	Node(int d) {
        data = d; 
        next = null;
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
        //Complete this method
        //Head points to first node of linked list
        //Int data is added to end of list as new Node object
        
        // Create new node, pass data as constructor argument
        Node newNode = new Node(data);

        // Check if LL is empty. If it is, set new node we just created as the head
        if (head==null){
            head = newNode;
        } else {
            // traverse to end of LL
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            // Insert node at the end
            current.next = newNode;
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
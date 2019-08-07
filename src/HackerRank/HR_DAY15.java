package HackerRank;

import java.io.*;
import java.util.*;

/**
 * 
 * Linked List
sample Input
4
2
3
4
1
 */

class Node {
	int data;
	Node next;
	Node (int d) {
		data = d;
		next = null;
	}
}

public class HR_DAY15 {
	
	public static Node insert(Node head, int data) {
		
		if (head == null) {
			return new Node(data);
		} else  if (head.next == null) {
			head.next = new Node(data);
		} else {
			insert(head.next, data);
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
	
	public static void main(String[] args) {
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

package dsaprogramming;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    // Add a node at the end
	    void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    // Print the list
	    void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.printList(); // Output: 1 2 3
	    }
	}




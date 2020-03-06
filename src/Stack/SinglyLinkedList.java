package Stack;

public class SinglyLinkedList {

	
	Node head;
	
	class Node{
		int data ;
		Node next;
	}
	
	SinglyLinkedList(){
		this.head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
		
	}
	
	public boolean push(int x) {
		
		Node temp = new Node();
		
		if(temp == null) {
			System.out.println("Stack OverFlow");
			
		}
		temp.data = x;
		temp.next = head;
		head = temp;
		return true;
		
	}
	
	public boolean pop() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");
			return false;
		}
		Node curr_node = head;
		head = curr_node.next;
		curr_node = null;
		return false;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");
			return -1;
		}
		
		return head.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");	
		}
		else {
			while(head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList s = new SinglyLinkedList();
		s.push(4);
		s.push(13);
		s.pop();
		s.push(19);
		s.display();
	

	}

}

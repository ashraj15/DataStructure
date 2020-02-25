package List;

public class DoublyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
		}
	}

// to add new elements in DoublyLinkedList	
	public static DoublyLinkedList add (DoublyLinkedList ll,int d) {
		
		Node curr_node = ll.head;
		Node new_node = new Node(d);
		
		if(curr_node == null) {
			ll.head = new_node;
		}else {
			while(curr_node.next != null)
				curr_node=curr_node.next; 
			curr_node.next = new_node;
			new_node.prev = curr_node;
		}
		return ll;
		
	}
	
	public static DoublyLinkedList display(DoublyLinkedList dl) {
		
		Node curr_node = dl.head;
		if(curr_node == null) {
			System.out.println("No elements in DoublyLinkedList");
			return null;
		}
		while(curr_node != null) {
			System.out.println(curr_node.data);
			curr_node = curr_node.next;
		}
		return dl;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dl = new DoublyLinkedList();
		add(dl,1);
		add(dl,2);
		add(dl,3);
		display(dl);

	}

}

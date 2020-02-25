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
	
// to insert new node at position n	
	public static DoublyLinkedList insert(DoublyLinkedList dl, int n, int d) {
		
		Node curr_node = dl.head;
		Node new_node = new Node(d);
		
// if head is present and n ==0		
		if(curr_node != null && n == 0) {
			dl.head = new_node;
			dl.head.next = curr_node;
			curr_node.prev = new_node;
			return dl;
		}

// if head is not present and n == 0		
		if(n == 0) {
			dl.head = new_node;
			return dl;
		}
		
// at any arbitrary position n		
		int count = 0;
		while(curr_node != null) {
			Node prev_node = curr_node;
			if(count != n) {
				curr_node = curr_node.next;
				
// if n is at tail(suppose 1,2,3,4 and n = 4 , d =5.. so 1,2,3,4,5				
				if(curr_node == null && count == n-1) {
					prev_node.next = new_node;
					new_node.prev = prev_node;
					return dl;
				}
//if n is beyond tail value				
				if(curr_node == null) {
					System.out.println("Index out of Bound");
					return dl;
				}
				count++;
			}else {
				new_node.prev = curr_node.prev;
				new_node.next = curr_node.prev.next;
				curr_node.prev.next = new_node;
				break;
			}
			
		}
		return dl;
		
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
		insert(dl,0,5);
		insert(dl,3,8);
		insert(dl,5,18);
		insert(dl,7,18);
		display(dl);

	}

}

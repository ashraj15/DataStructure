package List;

public class SinglyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
		
	}
	
	// to add element
	public static SinglyLinkedList add(SinglyLinkedList list, int d) {
		
		Node new_node = new Node(d);
	//	new_node.next = null;
		
		if(list.head == null)
			list.head = new_node;
		else {
			Node last = list.head;
			while(last.next != null)
				last = last.next;
			last.next = new_node;
		}
		return list;
		
	}

//	to insert value d at position n in list ll	
	public static SinglyLinkedList insert(SinglyLinkedList ll,int n,int d) {
		Node curr_node = ll.head;
		Node new_node = new Node(d);
		
	// case 1 - insert at head, n =0
		if(curr_node != null && n == 0)
		{
			ll.head = new_node;
			new_node.next = curr_node;
		}
		if(n == 0) {
			ll.head = new_node;
	
		return ll;
		}
		
	//case 2 - insert at any arbitrary position n
		Node prev_node = null;
		int count = 0;
		while(curr_node != null) {
			if(count != n) {
				prev_node = curr_node;
				curr_node = curr_node.next;
	// incase posotion is to add after last node			
				if(curr_node == null && count == n-1)
				{
					prev_node.next = new_node;
					return ll;
				}
 // if index is out of bound				
				if(curr_node == null) {
					System.out.println("out of bound index");
					return ll;
				}
				count++;
			}
			else {
			prev_node.next = new_node;
			new_node.next = curr_node;
			break;
			}
			
		}
		
		
		return ll;
		
		
	}
	
// to remove node at tail	
			public static void remove(SinglyLinkedList list) {
				Node curr_node = list.head;
				Node prev_node = null;
				while(curr_node.next != null) {
					prev_node = curr_node;
					curr_node = curr_node.next;
					
				}
				prev_node.next = null;	
				
			}
			
// to remove node at position n	
	public static SinglyLinkedList remove(SinglyLinkedList list, int n) {
		Node curr_node = list.head;
		Node prev_node = null;
		int count = 0;
// case 1 : when n ==0		
		if(count == n && curr_node != null) {
			list.head = curr_node.next;
			return list;
		}

// case	2 : at any arbitrary position n	
		while(curr_node != null) {
		    if(count != n) {
		    prev_node = curr_node;	
			curr_node = curr_node.next;
// case when we reach end of list but position not found			
			if(curr_node == null) {
				System.out.println("position out of bound");
				return list;
			}
			
			count++;
			}
		    
		    else {
		    	prev_node.next = curr_node.next;
		    	curr_node.next = null;
		    	break;
		    }
		
		}
		return list;	

	}	

// to delete given key
	
	public static SinglyLinkedList removeBykey(SinglyLinkedList list, int v) {
		Node curr_node = list.head;
		Node prev_node = null;
		while(curr_node != null) {
			prev_node = curr_node;
			curr_node = curr_node.next;
			
// if key is not found			
			if(curr_node.next == null) {
				System.out.println("Key not found");
				break;
			}
			if(curr_node.next.data == v) {
				curr_node.next = curr_node.next.next;
				break;
			}
			
		}
		
		return list;
		
	}
	
	// to display all elements
	public static void display(SinglyLinkedList list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.println(curr_node.data);
			curr_node = curr_node.next;
		}
		
	}
	

	

	
	
	
	public static void main(String [] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		
		 insert(ll,0,0);
		 add(ll, 1);
		 add(ll, 2);
		// display(ll);
		 add(ll, 3);
		 add(ll, 4);
		 add(ll, 5);
	//	 remove(ll);
	//	 remove(ll);
//		 remove(ll);
		
		 insert(ll,2,7);
		 insert(ll,7,9);
		// remove(ll,2);
		// remove(ll,4);
		 removeBykey(ll,9);
		// remove(ll,0);
		display(ll);
	}
}

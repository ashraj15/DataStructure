package List;

public class DoublyLinkedList {
	
	Node head;
	Node tail;
	int length;
	
	
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	 class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
		}
	}

	public boolean isEmpty() {
		return length == 0;
	}
		
	
// to add new elements in DoublyLinkedList	
	public void add (int d) {
		
		
		Node new_node = new Node(d);
		
		if(isEmpty()) {
			head = tail = new_node;
		}else {
			tail.next  = new_node;
			new_node.prev = tail;
			tail = tail.next;
			
		}
		length++;
	//	return ll;
		
	}
	
// to insert new node at position n	
	public  void insert( int n, int d) {
		
		int flag = 0;
		Node curr_node = head;
		Node new_node = new Node(d);
		
// if head is present and n ==0		
		if(!isEmpty() && n == 0) {
			head.prev = new_node;
			head = head.prev;
			head.next = curr_node;
		//	return dl;
		}

// if head is not present and n == 0		
		else if(isEmpty() && n == 0) {
			add(d);
			flag = 1;
		//	return dl;
		}
		
// at any arbitrary position n	
		else {
			int count = 0;
			while(curr_node != null) {
				Node prev_node = curr_node;
				if(count != n) {
					curr_node = curr_node.next;
					
	// if n is at tail(suppose 1,2,3,4 and n = 4 , d =5.. so 1,2,3,4,5				
					if(curr_node == null && count == n-1) {
						prev_node.next = tail = new_node;
						new_node.prev = prev_node;
						
						break;
					}
	//if n is beyond tail value				
					if(curr_node == null) {
						System.out.println("Index out of Bound");
						flag = 1;
						break;
					}
					count++;
				}else {
					new_node.prev = curr_node.prev;
					new_node.next = curr_node;
					curr_node.prev.next = new_node;
					curr_node.prev = new_node;
					break;
				}
				
			}
		}	
		if(flag == 0)
		length++;
		
		//return dl;
		
	}

// to remove node at position n	
public  void remove(int n) {
	
	int flag = 0;
	Node curr_node = head;
	
// if head is empty	
	if(isEmpty()) {
		System.out.println("DoublyLinkedList is empty");
		flag = 1;
	}

// if head is not empty and n == 0	
	else if(!isEmpty() && n == 0) {
		head = head.next;
		head.prev = null;
	}
	
// to remove node at any arbitrary position n	
	else {
		int count = 0;
	while(curr_node != null) {
		if( count != n) {
			curr_node = curr_node.next;

// if index n is out of bound			
			if(curr_node == null) {
				System.out.println("Index out of bound");
				flag = 1;
				break;
			}
			count++;
		}else {
			
			
			if(curr_node.next != null) {
				curr_node.next.prev = curr_node.prev;
				curr_node.prev.next =  curr_node.next;
				curr_node = null;
				break;
			}
			
// if n is at tail			
			else {
				if(length-1 == n)
			//	curr_node.prev.next  = curr_node.next;
				tail = tail.prev;
				tail.next = null;
			}
			curr_node = null;
			break;
		}
	  }
	}
	if(flag == 0)
		length--;
	
	
}	

// to remove node by key
public  void removeBykey( int v) {
	
	Node curr_node = head;

// if head is empty	
	if(head == null) {
		System.out.println("DoublyLinkedList is empty");
		//return dl;
	}
	
//if head is not empty and key is at head	
	else if(head != null && head.data == v) {
		head = head.next;
		head.prev = null;
		length--;
		//return dl;
	}

// if key is not at head
	else {
		while(curr_node != null) {
			if(curr_node.data != v) {
				curr_node =curr_node.next;

	// if key is not found 			
				if(curr_node == null) {
					System.out.println("node not found");
					break;
				}
			}else {
				curr_node.prev.next = curr_node.next;
				if(curr_node.next != null)
				curr_node.next.prev = curr_node.prev;
				else
					tail = tail.prev;
				curr_node = null;
				length--;
				break;
			}
		}
	}
	
	//return dl;
	
}

// to display all nodes forward
	public  void display() {
		
		Node curr_node = head;
		if(curr_node == null) {
			System.out.println("No elements in DoublyLinkedList");
																					
		}
		else {
		while(curr_node != null) {
			System.out.println(curr_node.data);
			curr_node = curr_node.next;
		}
	}	
		
		
	}
	
public void  displayBackward() {
		
		Node curr_node = tail;
		if(tail == null) {
			System.out.println("No elements in DoublyLinkedList");
			
		}
		else {
			while(curr_node != null) {
				System.out.println(curr_node.data);
				curr_node = curr_node.prev;
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.insert(0, 4);
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.insert(0, 5);
		dl.insert(3, 8);
		dl.insert(6, 10);
//		insert(dl,0,5);
//		insert(dl,3,8);
//		insert(dl,5,18);
		dl.display();
		System.out.println();
		dl.remove(0);
		System.out.println();
		dl.display();
		dl.remove(5);
		System.out.println();
		dl.removeBykey(3);
		dl.display();
		dl.displayBackward();
		dl.remove(3);
//		remove(dl,5);
//		display(dl);
//		System.out.println();
//		removeBykey(dl,18);
//		display(dl);
//		removeBykey(dl,183);

	}

}

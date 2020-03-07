package Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueLinkedList<T> implements Iterable<T> {
	
	LinkedList<T> ll = new LinkedList<T>();
	
	QueueLinkedList(){};
	
	QueueLinkedList(T elem){
		ll.addFirst(elem);
	}
	
	
	boolean isEmpty() {
		return ll.size() == 0;
	}
	
	boolean enqueue(T item) {
		
		ll.addLast(item);
		
		return false;
		
	}
	
	T dequeue() {
		if(isEmpty())
			throw new java.util.NoSuchElementException();
		return ll.removeFirst();
	}
	
	T front() {
		if(isEmpty())
			throw new java.util.NoSuchElementException();
		return ll.peekFirst();
	}
	
	T rear() {
		if(isEmpty())
			throw new java.util.NoSuchElementException();
		return ll.peekLast();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<Integer> ql = new QueueLinkedList<Integer>();
		
		ql.enqueue(23);
		ql.enqueue(43);
		ql.enqueue(87);
		System.out.println(ql.dequeue());
		System.out.println(ql.front()+" "+ql.rear());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

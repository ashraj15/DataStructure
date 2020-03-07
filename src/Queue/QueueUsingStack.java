package Queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class QueueUsingStack<T> implements Iterable<T> {
	
	Stack<T> s = new Stack<T>();
	
	
	QueueUsingStack(){
		
	}
	QueueUsingStack(T elem){
		s.push(elem);
	}
	
	boolean enqueue(T elem) {
		s.push(elem);
		return true;
	}

	T dequeue() {
		if(s.isEmpty())
			throw new java.util.NoSuchElementException();
			return s.remove(0);			
	}
	
	T rear() {
		return s.peek();
	}
	
	
	T front() {
		if(s.isEmpty())
			throw new java.util.NoSuchElementException();
		
		ListIterator<T> itr =  s.listIterator();
		
        	return itr.next();
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack<Integer> qs = new QueueUsingStack<Integer>();
		qs.enqueue(12);
		qs.enqueue(15);
		qs.enqueue(10);
		System.out.println(qs.front()+" "+qs.rear());
		System.out.println(qs.dequeue());
		System.out.println(qs.front()+" "+qs.rear());
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		//System.out.println(qs.dequeue());
		//System.out.println(qs.dequeue());

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

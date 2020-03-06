package Stack;

import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedList<T> implements Iterable<T>{
	
	LinkedList<T> list = new LinkedList<T>();
	
	StackLinkedList(){}
	
	StackLinkedList(T elem){
		push(elem);
	}
	
	private void push(T elem) {
		// TODO Auto-generated method stub
		list.addLast(elem);
		
	}

	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	
	private T pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.removeLast();
		
	}
	
	private T peek() {
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.peekLast();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList<Integer> ss = new StackLinkedList<Integer>();
		ss.push(12);
		ss.push(11);
		ss.push(34);
		System.out.println(ss.pop());
		System.out.println(ss.peek());
		System.out.println(ss.pop());
		

	}

	

}

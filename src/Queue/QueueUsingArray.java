package Queue;

public class QueueUsingArray {
	
	int [] arr;
	int front,rear,capacity,size;
	
	QueueUsingArray(int max){
		this.capacity = max;
		this.front = this.size = 0;
		this.rear = this.capacity-1;
		arr = new int[this.capacity];
	}
	
	boolean isFull() {
		return (size == capacity);
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	boolean enqueue(int item) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		this.rear = (this.rear+1)%this.capacity;
		this.arr[this.rear] = item;
		this.size = this.size+1;
		return true;
	}
	
	int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		int item = this.arr[this.front];
		this.front = (this.front+1)%this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	int front() {
		if(isEmpty()) 
			return Integer.MIN_VALUE;
	
	return this.arr[this.front];
	}	
	
	
	int rear() {
		if(isEmpty()) 
			return Integer.MIN_VALUE;
		return this.arr[this.rear];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingArray q = new QueueUsingArray(3);
		q.enqueue(12);
		q.enqueue(15);
		q.enqueue(10);
		//q.enqueue(21);
		//System.out.println(q.size);
		System.out.println(q.front()+" "+q.rear());
		System.out.println(q.dequeue());
		System.out.println(q.front()+" "+q.rear());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}

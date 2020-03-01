package Stack;

public class Array {
	
	
	final int MAX = 3;
	int top;
	int [] arr = new int[MAX];
	
	
	Array() {
		top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top < 0);
		
	}
	
	public boolean isFull() {
		return (top >= MAX-1);
	}
	
	public boolean push(int v) {
		if(isFull()) {
			System.out.println("Stack OverFlow");
			return false;
		}
		arr[++top] = v;
		return true;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");
			return 0;
		}
		int v = arr[top--];
		return v;
		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack UnderFlow");
			return 0;
		}
		int v = arr[top];
		return v;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a = new Array();
		a.push(3);
		a.push(7);
		a.push(6);
		a.push(8);
		System.out.println(a.pop());
		System.out.println(a.peek());
		

	}

}

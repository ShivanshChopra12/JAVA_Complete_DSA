package lec33;

public class Queue {
	int[] arr;
	int s;
	int size;

	public Queue() {
		this(5);
	}

	public Queue(int cap) {
		arr = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		return size() == arr.length;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("kya dekh raha hai?");
		}

		return arr[s];
	}

	public void add(int ali) {
		if (isFull()) {
			throw new RuntimeException("Full hu bhai");
		}
		
		int idx = (s + size()) % arr.length;
		arr[idx]=ali;
		size++;
	}
	
	public int poll() {
		if (isEmpty()) {
			throw new RuntimeException("ni h kuch baki");
		}
		
		int ans = arr[s];
		s= (s+1)%arr.length;
		size--;
		return ans;
	}
	
	public void print() {
		
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

}

package lec32;

import lec31.Stack;

public class Min_stack extends Stack {
	int curr_min = Integer.MAX_VALUE;

	public int peek() {
		int ali = super.peek();
		if (ali < curr_min) {
//		ali is a magical number and is a function
//			M=2*curr-prev
			return curr_min;
		} else {
			return ali;
		}
	}

	public void add(int ali) {
		if (isEmpty()) {
			curr_min = ali;
			super.add(ali);
			return;
		}
		if (ali >= curr_min) {
			super.add(ali);
		} else {
//			curr_min=10;8
//			Magical no.ali !! and update curr min!!
			int prev_min = curr_min;
			curr_min = ali;
			int Magical = 2 * curr_min - prev_min;
			super.add(Magical);
		}
	}

	public int pop() {
		int ali = super.pop();

		if (ali < curr_min) {
//			 magical =>M=2*curr-prev;
			int ans = curr_min;
//			prev=2*curr-M
			int prev_min = 2 * curr_min - ali;
			curr_min = prev_min;
			return ans;
		}
		else {
			return ali;
		}
	}
	
	public int getMin() {
		return curr_min;
	}

}

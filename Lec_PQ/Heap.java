package Lec_PQ;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> AL;

	public Heap() {
		AL = new ArrayList<>();
	}

	public void add(int ali) {
		AL.add(ali);
		unheapify(AL.size() - 1);
	}

	private void unheapify(int child) {

		int parent = (child - 1) / 2;
		if (AL.get(child) < AL.get(parent)) { // min heap!!

			swap(child, parent);
			unheapify(parent);
		}

	}

	private void swap(int i, int j) {
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public int peek() {
		return AL.get(0);
	}

	public int poll() {
		int ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size() - 1);
		downheapify(0);
		return ans;
	}

	private void downheapify(int p) {
		int L = 2 * p + 1;
		int R = 2 * p + 2;
		int min = p;

		if (L < AL.size() && AL.get(min) > AL.get(L)) {
			min = L;
		}
		if (R < AL.size() && AL.get(min) > AL.get(R)) {
			min = R;
		}

		if (p != min) {
			swap(min, p);
			downheapify(min);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return AL + "";
	}
}

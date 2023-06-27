package lec33;

public class Dynamic_Q extends Queue {

	@Override
	public void add(int ali) {
		if(isFull()) {
//			grow!!
			
			int big[]= new int[super.arr.length*2];
			for(int idx=0;idx<arr.length;idx++) {
				big[idx]=arr[(s+idx)%arr.length];
			}
			s=0;
			arr=big;
		}
		
		super.add(ali);
	}

}

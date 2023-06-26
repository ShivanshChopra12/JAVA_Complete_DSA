package lec10;
//TLE will be issue bcz 2 loops
//53. Maximum Subarray Leet code
public class Sum_of_subarray_twoloops {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40};

	System.out.println(M2(arr));
	}

	public static int M2(int[] arr) {
	int ans=0;
		for (int start = 0; start < arr.length; start++) {
			int sum = 0;
			for (int end = start; end < arr.length; end++) {
					sum = sum + arr[end];
					
					System.out.println("=>"+sum);
					if(sum>ans) {
						ans=sum;
					}
				}
			}
		return ans;
		}
		
	}


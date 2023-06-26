package leetcode;

import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 
		 for(int i=0;i<t;i++) {
			 
			 int towers = sc.nextInt();
			 int arr[] = new int[towers];
		for(int j=0;j<towers;j++) {
			arr[j]=sc.nextInt();
		}	 
		int ans= trap(arr);
		System.out.println(ans);
		 }

		//O(n^2) approach
//		int waterTrapped=0;
//		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
//
//		for(int i=0;i<arr.length;i++) {
//			int left=0;
//			int right=0;
//			
//			for(int j=0;j<=i;j++) {
//				left=Math.max(left,arr[j]);
//			}
//			for(int j=i;j<arr.length;j++) {
//				right=Math.max(right,arr[j]);
//			}
//			
//			waterTrapped = waterTrapped + Math.min(left, right)-arr[i];
//			
//		}
//		System.out.println(waterTrapped);

		
	}
	public static int trap(int[] height) {
        int left[]= new int [height.length];
        int right[]= new int [height.length];
        
        int max=height[0];
        
        //left array
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        
        //right array
        max=height[height.length-1];
         for(int i=height.length-1;i>=0;i--){
            max=Math.max(height[i],max);
            right[i]=max;
        }
        
        int ans=0;
        for(int i=0;i<height.length;i++){
            ans  = ans+ Math.min(left[i],right[i])-height[i];
        }
       return ans;
    }

}

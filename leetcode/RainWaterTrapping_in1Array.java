package leetcode;

public class RainWaterTrapping_in1Array {

	public static int trap(int[] height) {
        int left[]= new int [height.length];
        int right[]= new int [height.length];
        
        int max=height[0];
        
        //left array
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        
        
        int ans=0;
        max=height[height.length-1];
         for(int i=height.length-1;i>=0;i--){
            max=Math.max(height[i],max);
            ans+= Math.min(left[i], max)-height[i];
        }
        
       return ans;
    }
}

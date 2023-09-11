package leetcode;

public class nextGreaterLetter {
//	https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
	
	class Solution {
	    public char nextGreatestLetter(char[] letters, char target) {

		int s=0,e=letters.length-1;
		char val=letters[0];

		while(s<=e)
		{
			int m=s+(e-s)/2;
			if(letters[m]>target)
			{
				val=letters[m];
				e=m-1;
			}
			else
				s=m+1;
		}
		return(val);
	}
	}
}

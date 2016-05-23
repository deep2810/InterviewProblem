package arrayProblem;

import java.util.Arrays;

public class SubsequenceProduct {
	
	public static int[] subSequent(int[] array){
		
		int subsequent[]=new int[3];
		int maxProductTillNow=0;
		
		if(array.length<3){
			return array;
		}
		for(int i=1;i<array.length;i++){
			
			int left=0,right=0;
			for(int j=0;j<i;j++){
				if(array[j]>left && array[j]<array[i]){
					left=array[j];
				}
			}
			
			for(int j=i+1;j<array.length;j++){
				if(array[j]>right && array[j]>array[i]){
					right=array[j];
				}
			}	
			
			int currentMaxProduct=array[i]*left*right;
			
			if(currentMaxProduct>maxProductTillNow){
				maxProductTillNow=currentMaxProduct;
				subsequent=new int[]{left, array[i], right};
			}
		}
		return subsequent;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(subSequent(new int[]{6,7,8,1,2,3,9,10})));
		int[] ints = new int[] {1, 11, 12, 7, 8, 9};
		System.out.println(Arrays.toString(subSequent(ints)));
	}
}

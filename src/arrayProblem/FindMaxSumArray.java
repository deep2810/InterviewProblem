package arrayProblem;

import java.util.Arrays;

public class FindMaxSumArray {

	public static String maxSubArray(int [] array){
		int maxSoFar=0;
		int maxCurrent=0;
		int maxStartIndex=0;
		int maxEndIndex=0;
		for(int i=0;i<array.length;i++){
			if(maxCurrent+array[i]>0){
				maxCurrent=maxCurrent+array[i];
			}
			else{
				maxCurrent=0;
				maxStartIndex=i+1;
			}
			if(maxSoFar<maxCurrent){
				maxSoFar=maxCurrent;
				maxEndIndex=i;
			}
		}
		
		int[] maxArray=new int[maxEndIndex-maxStartIndex];
		if(maxStartIndex<=maxEndIndex){
			maxArray=Arrays.copyOfRange(array, maxStartIndex, maxEndIndex+1);
		}
		return String.valueOf("\nInput-Array:" + Arrays.toString(array)
                + "\nMax: " + maxSoFar
                + "\nSub-Array:" + Arrays.toString(maxArray));
	}
	
	public static void main(String[] args) {
		int[] inputArray = new int[]{  22, 19, 70, 4,2,-30 , 20, 40};
		System.out.println(maxSubArray(inputArray));
	}
}

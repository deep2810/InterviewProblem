package arrayProblem;

public class MinimumDifferenceSortedArrays {
	public static void main(String[] args) {
		 int[] inputArrayX = new int[]{8, 12, 14};
	        int[] inputArrayY = new int[]{22, 28, 40};
	        findMinDifferenceUsingWhile(inputArrayX, inputArrayY);
	}
	public static void findMinDifferenceUsingWhile(int[] inputArrayX, int[] inputArrayY) {
		int minDifference=Math.abs(inputArrayX[0]-inputArrayY[0]);
		int i=0,j=0;
		while(i<inputArrayX.length && j<inputArrayY.length){
			minDifference=Math.min(minDifference, Math.abs(inputArrayX[i]-inputArrayY[j]));
			if(inputArrayX[i]<inputArrayY[j])
				i++;
			else
				j++;
		}
		System.out.println(minDifference);
	}
}

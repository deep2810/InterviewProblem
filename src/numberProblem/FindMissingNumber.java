package numberProblem;

public class FindMissingNumber {
	
	public static int findMissingNumberUsingXOR(int[] inputArray) {
		
		int xor1=1;
		int xor2=inputArray[0];
		
		for(int i=2;i<=inputArray.length+1;i++){
			xor1=xor1 ^ i;
		}
		
		for(int i=1;i<inputArray.length;i++){
			xor2=xor2 ^ inputArray[i];
		}
		
		return xor1 ^ xor2;
	}
	
	public static int findMissingNumberUsingFormula(int[] inputArray) {
        int sum = 0;
        for (int i : inputArray) {
            sum = i + sum;
        }
        // actual size of array is length + 1 since one number is missing.
        int length = inputArray.length + 1;
        int factor = length * (length + 1) / 2;
        return  factor - sum;
    }
	
	public static void main(String[] args) {
		System.out.println(findMissingNumberUsingXOR(new int[]{1,2,3,4,6,7,8}));
	}
}

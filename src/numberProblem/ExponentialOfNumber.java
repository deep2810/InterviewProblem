package numberProblem;

public class ExponentialOfNumber {

	public static int findExponentialOfNumber(int number, int exponentFactor) {
		int result=1;
		while(exponentFactor>0){
			if(exponentFactor%2==1){
				result=result*number;
			}
			exponentFactor=exponentFactor/2;
			number=number*number;
		}
		return result;
	}
	
	public static void main(String[] args) {
        System.out.println(findExponentialOfNumber(4, 4));
        System.out.println(findExponentialOfNumber(2, 3));
        System.out.println(findExponentialOfNumber(2, 6));
        System.out.println(findExponentialOfNumber(3, 3));
    }
}

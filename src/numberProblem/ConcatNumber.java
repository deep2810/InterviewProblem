package numberProblem;

public class ConcatNumber {

	
	public static void concatenateNumbers(long x, long y) {
		long temp=y;
		do{
			temp=temp/10;
			x=x*10;
		}while(temp>0);
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		concatenateNumbers(123, 456);
	}
}

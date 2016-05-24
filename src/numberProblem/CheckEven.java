package numberProblem;

public class CheckEven {
	
	public static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(9));
        System.out.println(isEven(3455));
        System.out.println(isEven(29));
        System.out.println(isEven(0));
    }
}

package numberProblem;

public class ConvertStringToNumber {
	
	public static int convertStringToNum(String inputString) {
        int factor = (int) Math.pow(10, inputString.length() - 1);
        int temp1;
        int temp2 = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                temp1 = Character.getNumericValue(inputString.charAt(i)) * factor;
                temp2 = temp1 + temp2;
                factor = factor / 10;
            } else {
                System.out.println("Please enter numbers only");
                return 0;
            }
        }
        return temp2;
    }
	
	public static void main(String[] args) {
		System.out.println("123");
	}
}

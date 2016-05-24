package stringProblem;

public class IsPalindrome {
	
	public static boolean isPalindrome(String str){
		int len=str.length();
		for(int j=0;j<len/2;j++){
			if(str.charAt(j)!=str.charAt(len-j-1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindromeRecur(String str,int left,int right){

		if(left==right || left==str.length()-1){
			return true;
		}
		
		if(str.charAt(left)!=str.charAt(right)){
			return false;
		}
		
		return isPalindromeRecur(str, left+1, right-1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("deep"));
		System.out.println(isPalindrome("deed"));
		String str="deep";
		System.out.println(isPalindromeRecur(str, 0, str.length()-1));
		String str1="deed";
		System.out.println(isPalindromeRecur(str1, 0, str1.length()-1));
	}
}

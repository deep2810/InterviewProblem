package stringProblem;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
	
	public static boolean allUniqueUsingSet(String str){
		
		Set<Character> charSet=new HashSet<Character>();
		
		for(char ch:str.toCharArray()){
			if(!charSet.add(ch)){
				return false;
			}
			charSet.add(ch);
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		String str="abscdef";
		String str1="tomorrow";
		System.out.println(allUniqueUsingSet(str));
		System.out.println(allUniqueUsingSet(str1));
	}
}

package stringProblem;

import java.util.*;

public class LongestSubstringUnrepeatedChar {
	
	public static String longestSubstringUnrepeatedChar(String inputString) {
        String longestSoFar = "";
        String longestSubstringResult = "";
        if (inputString.isEmpty()) {
            return "";
        }
        if (inputString.length() == 1) {
            return inputString;
        }
        
        Map<Character,Integer> 	map=new HashMap<Character,Integer>();
        
        for(int i=0;i<inputString.length();i++){
        	char currentCharacter = inputString.charAt(i);
        	if(longestSoFar.indexOf(currentCharacter)==-1){
        		if(!map.containsKey(currentCharacter)){
        			map.put(currentCharacter, i);
        		}
        		longestSoFar=longestSoFar+currentCharacter;
        	}
        	else{
        		longestSoFar = inputString.substring(map.get(currentCharacter) + 1, i + 1);
                map.put(currentCharacter, i);
        	}
        	if (longestSoFar.length() > longestSubstringResult.length()) {
                longestSubstringResult = longestSoFar;
            }
        }
        
        return longestSubstringResult;
	}
	
	public static void main(String[] args) {
//		String string = "ABCADEABFTR";
//      String string = "AABC";
//      String string = "abcdefghijklmnopqrstuvwxyz";
        String string = "abcdeffffffffghijklmnopq";
//      String string = "abcdefcbhcjklmc";
        System.out.println(LongestSubstringUnrepeatedChar.longestSubstringUnrepeatedChar(string));
	}
}

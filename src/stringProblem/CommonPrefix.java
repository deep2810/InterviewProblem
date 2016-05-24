package stringProblem;

import java.util.ArrayList;
import java.util.List;

public class CommonPrefix {
	
	private static String commonString = "";

    public String findCommonFromList(List<String> inputList) {
        commonString = inputList.get(0);
        for (int i = 0; i < inputList.size() - 1; i++) {
            commonString = findCommon(commonString, inputList.get(i + 1));
        }
        return commonString;
    }

    private String findCommon(String string1, String string2) {
        String temp = "";
        int minLength = Math.min(string1.length(), string2.length());
        for (int i = 0; i < minLength; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                temp = temp + string1.charAt(i);
            } else {
                break;
            }
        }
        return temp;
    }
    
    public static void main(String[] args) {
    	 List<String> inputList = new ArrayList<String>();
    	 inputList.add("aaabc");
       	 inputList.add("aaacc");
       	 inputList.add("aadc");
     //  	 inputList.add("daadc");
       	 CommonPrefix commonPrefix = new CommonPrefix();
       	 System.out.println(commonPrefix.findCommonFromList(inputList));
	}
}

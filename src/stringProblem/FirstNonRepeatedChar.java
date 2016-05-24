package stringProblem;

import java.util.*;

public class FirstNonRepeatedChar {

	public static char findFirstNonRepeatedChar(String inputString) {
        Map<Character, Integer> charMapCountOne = new LinkedHashMap<Character, Integer>();
        Set<Character> repeatedCharSet = new HashSet<Character>();
        for (char c : inputString.toCharArray()) {
            if (charMapCountOne.get(c) == null && !repeatedCharSet.contains(c)) {
                charMapCountOne.put(c, 1);
            } else {
                repeatedCharSet.add(c);
                charMapCountOne.remove(c);
            }
        }
        if (charMapCountOne.isEmpty()) {
            return " ".charAt(0);
        }
        return charMapCountOne.keySet().iterator().next();
    }

    public static char firstNonRepeatedChar(String inputString) {
        char[] inputChars = inputString.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < inputChars.length; i++) {
            if (set.add(inputChars[i])) {
                for (int j = i + 1; j < inputChars.length; j++) {
                    if (inputChars[i] == inputChars[j]) {
                        break;
                    }
                    if (j == inputChars.length - 1) {
                        return inputChars[i];
                    }
                }
            }
        }
        return " ".charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("aaebbgccad"));
        System.out.println(firstNonRepeatedChar("faaebbccad"));
        System.out.println(findFirstNonRepeatedChar("faskdfaskd"));
    }
}

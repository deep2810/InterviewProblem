package stringProblem;

import java.util.*;

public class FindDuplicates {
	
	public static List<String> duplicateUsingSet(List<String> inputStringList){
		List<String> outputList=new ArrayList<String>();
		Set<String> set=new HashSet<String>();
		
		for(String str:inputStringList){
			if(!set.add(str) && !outputList.contains(str)){
				outputList.add(str);
			}
			set.add(str);
		}
		return outputList;
	}
	
	 public static List<String> findDuplicatesOrCountUsingFrequency(List<String> inputStringList) {
	        Set<String> tempSet = new HashSet<String>();
	        List<String> outList = new ArrayList<String>();
	        tempSet.addAll(inputStringList);
	        for (String str : tempSet) {
	             outList.add(str + ": " + Collections.frequency(inputStringList, str));
	        }
	        return outList;
	    }
	
	public static void main(String[] args) {
		List<String> listString=new ArrayList<String>();
		listString.add("hi");
		listString.add("pink");
		listString.add("yellow");
		listString.add("blue");
		listString.add("hi");
		listString.add("blue");
		System.out.println(duplicateUsingSet(listString));
		System.out.println(findDuplicatesOrCountUsingFrequency(listString));
	}
}

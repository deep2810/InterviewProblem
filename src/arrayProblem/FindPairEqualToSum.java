package arrayProblem;

import java.util.ArrayList;
import java.util.List;


public class FindPairEqualToSum {

	public static List<String> findPair(int[] array,int sum){
		List<Integer> inputList=new ArrayList<Integer>();
		List<String> strList=new ArrayList<String>();
		
		for(int elem:array){
			inputList.add(elem);
		}
		
		for(int i:array){
			int tempInt=sum-i;
			if(inputList.contains(tempInt)){
				if(tempInt==i && times(array,i)==1){
					continue;
				}
				String pair = String.valueOf("("+i + ", " + tempInt+")");
                strList.add(pair);
			}
		}
		return strList;
	}
	
	public static int times(int[] array,int value){
		int count=0;
		for(int i:array){
			if(i==value){
				count=count+1;
			}
		
		}
		return count;
	}
	public static void main(String[] args) {
		int[] numbers = {3, 9, 8, 4, 5, 7,10,8, 2};
		System.out.println(findPair(numbers, 16));
	}
}

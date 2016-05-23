package arrayProblem;

import java.util.Arrays;

public class CircularShift {
	
	public static int[] circularShiftRight(int[] array,int index){
		if(index==0){
			return array;
		}
		int output[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			output[i]=array[(i+index)%array.length];
		}
		return output;
	}
	
	public static int[] circularShiftLeft(int[] array,int index){
		if(index==0){
			return array;
		}
		int output[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			output[(i+index)%array.length]=array[i];
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] ints = new int[] {1, 11, 12, 7, 8, 9};
		System.out.println(Arrays.toString(circularShiftRight(ints, 1)));
		System.out.println(Arrays.toString(circularShiftLeft(ints, 1)));
	}
}

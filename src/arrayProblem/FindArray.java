package arrayProblem;

public class FindArray {
	
	public static int findArray(int[] array,int[] subArray){
		
		int startIndex=-1;
		if(subArray.length> array.length){
			return -1;
		}
		int subArrfirstElem=subArray[0];
		for(int i=0;i<array.length;i++){
			if(array[i]==subArrfirstElem){
				if(subArray.length==1){
					startIndex=i;
					return startIndex;
				}
				int j=1,k=i+1;
				while(k<array.length && j<subArray.length){
					if(array[k]!=subArray[j])
						break;
					if(j==subArray.length-1){
						startIndex=i;
						return startIndex;
					}
					k++;
					j++;
				}
			}
		}
		return startIndex;
	}
	
	public static void main(String[] args) {
		System.out.println(FindArray.findArray(new int[]{8 , 9, 10}, new int[]{8, 9, 10}));
        System.out.println(FindArray.findArray(new int[]{7, 8, 9, 11, 8 , 9 ,10}, new int[]{8, 9, 10}));
	}
}

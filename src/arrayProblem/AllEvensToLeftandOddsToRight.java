package arrayProblem;

public class AllEvensToLeftandOddsToRight {
	public static void moveEventoLeft(int[] inputArray){
		int i=0,j=inputArray.length-1;
		
		System.out.println();
		System.out.println("before ordering:");
		for (int input : inputArray) {
            System.out.print(input + " ");
        }
		System.out.println();
		while(i<j){
			if(inputArray[i]%2==0){
				i++;
			}
			if(inputArray[j]%2!=0){
				j--;
			}
			if(i<j){
				swap(inputArray,i,j);
			}
		}
		System.out.println();
		System.out.println("after ordering:");
		for (int input : inputArray) {
            System.out.print(input + " ");
        }
		System.out.println();
	}
	
		public static void swap(int[] inputArray,int currentposition,int nextposition){
			int temp=inputArray[currentposition];
			inputArray[currentposition]=inputArray[nextposition];
			inputArray[nextposition]=temp;
		}
		
	
	
	public static void main(String[] args) {
		moveEventoLeft(new int[]{1, 4, 3, 4,3, 4, 1, 4, 1, 3, 5, 6});
		moveEventoLeft(new int[]{1, 4, 4, 6});
		moveEventoLeft(new int[]{4, 4, 6, 1});
		moveEventoLeft(new int[]{4, 3, 4, 6, 1});
		moveEventoLeft(new int[]{1, 3, 4});
		moveEventoLeft(new int[]{1, 4});

	}
}

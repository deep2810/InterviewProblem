package arrayProblem;

public class FindNumberWithHighestFreq {
	public static void main(String[] args) {
		findNumberWithHighestFreq(new int[]{0,0,0,0,1,1,2,5,5,6,6,6,6});
	}
	
	public static void findNumberWithHighestFreq(int[] Array){
		int len=Array.length;
		if(len<1){
			System.out.println("Atleast 1 element");
			return;
		}
		int currentCount=0;
		int globalCount=0;
		int globalMaxFreqNumber=Array[0];
		int currentMaxFreqnumber=Array[0];
		for(int item:Array){
			if(item!=currentMaxFreqnumber){
				currentMaxFreqnumber=item;
				currentCount=0;
			}
			currentCount++;
			if(currentCount>globalCount){
				globalCount=currentCount;
				globalMaxFreqNumber=currentMaxFreqnumber;
			}
		}
		System.out.println(globalMaxFreqNumber);
	}
}

package stringProblem;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class FindLatestVersion {

	public static String findLatest(String str1,String str2){
		
		StringTokenizer strTokanizer1=new StringTokenizer(str1,".");
		StringTokenizer strTokanizer2=new StringTokenizer(str2,".");
		
		while(strTokanizer1.hasMoreElements() || strTokanizer2.hasMoreElements()){
			long strVal1,strVal2;
			
			try{
				strVal1=Long.parseLong(strTokanizer1.nextToken());
			}catch(NoSuchElementException e){
				strVal1=01;
			}
			try{
				strVal2=Long.parseLong(strTokanizer2.nextToken());
			}catch(NoSuchElementException e){
				strVal2=01;
			}
			
			if(strVal1>strVal2){
				return str1;
			}
			
			if(strVal2>strVal1){
				return str2;
			}
		}
		return str1;
	}
	
	public static void main(String[] args) {
		System.out.println(findLatest("2.2.3", "2.2.3.2"));
	}
}

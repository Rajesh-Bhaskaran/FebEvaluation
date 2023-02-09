package spotAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array Length");
		int arrayLength=sc.nextInt();
		String [] stringArray= new String[arrayLength];
		int[] countArray= new int[arrayLength];
		
		//For Loop To Get  String Input
		for(int i=0;i<arrayLength;i++) {
			System.out.println("Enter Integer Associated With String");
			countArray[i]=sc.nextInt();
			if(i<arrayLength/2) {
				sc.nextLine();
				System.out.println("Enter String");
				stringArray[i]=sc.nextLine();
				stringArray[i]="-";
			}
			else {
				sc.nextLine();
				System.out.println("Enter String");
				stringArray[i]=sc.nextLine();
			}
		}
		
		//Method To Sort The String Based On Associated Number
		sortingString(stringArray,countArray);
		
		//For Loop To Display Output
		for(int i=0;i<stringArray.length;i++) {
			System.out.print(stringArray[i]+" ");
		}
		

	}

	private static void sortingString(String[] stringArray, int[] countArray) {
		boolean value=false;
		do {
			value=false;
			for(int i=0;i<countArray.length-1;i++) {
				if(countArray[i+1]<countArray[i]) {
					//swapping
					countArray[i+1]=countArray[i]+countArray[i+1]-(countArray[i]=countArray[i+1]);
					String temp=stringArray[i+1];
					stringArray[i+1]=stringArray[i];
					stringArray[i]=temp;
					value=true;
				}
			}
		}while(value);
	}

	

}

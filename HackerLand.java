package spotAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total daily clients Expenditure for the perid of n days");
		int n=sc.nextInt();
		System.out.println("Enter Number Of Trailing Days");
		int d=sc.nextInt();
		int[] expenditureArray=new int[n];
		
		//for loop to get Expenditure
		for(int i=0;i<n;i++) {
			System.out.println("Enter Expenditure");
			expenditureArray[i]=sc.nextInt();
		}
		
		double medianAmount=0;
		int warnings=0;
		for(int i=0;i<expenditureArray.length;i++) {
			if(i<d) {
				medianAmount+=expenditureArray[i];
			}
			else {
				if(expenditureArray[i]>=((medianAmount/d)*2))
					warnings++;
				medianAmount=medianAmount-expenditureArray[i-d+1]+expenditureArray[i];
			}
		}
		
		System.out.println("Number Of Warning Messages To Client ="+warnings);

	}

}

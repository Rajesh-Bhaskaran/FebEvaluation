package spotAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc.nextLine();
		System.out.println("Enter Number of weeks");
		int weeks=sc.nextInt();
		int k=0;
		while(k<weeks) {
			System.out.println("Enter i");
			int i=sc.nextInt();
			System.out.println("Enter r");
			int r=sc.nextInt();
			findingPalindrome(s1.substring(i-1, r));
			k++;
		}

	}

	private static void findingPalindrome(String s) {
		System.out.println(s);
		int[]arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
		
		//Sorting The Array
		boolean value=false;
		do {
			value=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					value=true;
					//swapping
					arr[i+1]=arr[i]+arr[i+1]-(arr[i]=arr[i+1]); 
				}
			}
		}while(value);
		//System.out.println(Arrays.toString(arr));
		
		int oneCount=0;
		int palindromecount=0;
		for(int i=0;i<arr.length;i++) {
			if(i!=0&&arr[i-1]==0&&arr[i]==0)
				break;
			if(arr[i]!=0&&arr[i]==1)
				oneCount++;
			if(arr[i]!=0&&arr[i]==2)
				palindromecount++;
		}
		System.out.println("Number Maximum Palindrome Possible "+(palindromecount+(oneCount/2)));
	}

}

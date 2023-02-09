package spotAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		int[][]arr=new int[number][number];
        int k=0;
        int value=0;
        int count=0;
        while(count<=number/2) {
        	if(count%2!=0)
        		k=0;
        	else
        		k=1;
        	printingPattern(k,arr,value++);
        	count++;
        }
        for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void printingPattern(int k, int[][] arr, int m) {
		for(int i=m;i<arr.length-m;i++) {
			for(int j=m;j<arr.length-m;j++) {
				arr[i][j]=k;
			}
		}
		
	}

}

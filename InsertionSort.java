package spotAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int arrayLength=sc.nextInt();
        int[]array=new int[arrayLength];
        for(int i=0;i<arrayLength;i++) {
        	System.out.println("Enter Values In Array");
        	array[i]=sc.nextInt();
        }
        
        insertSort(array);
        System.out.println(Arrays.toString(array));
	}

	private static void insertSort(int[] array) {
		int j=0;
		for(int i=0;i<array.length;i++) {
			j=i;
			while(j>0&&array[j-1]>array[j]) {
				array[j-1]=array[j]+array[j-1]-(array[j]=array[j-1]);
				j--;
			}
		}
		
	}

}

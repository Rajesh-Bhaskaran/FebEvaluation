package spotAssignment;

import java.util.Scanner;

public class FindingPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
        int arrayLength=sc.nextInt();
        System.out.println("Enter k");
        int k=sc.nextInt();
        int[] array=new int[arrayLength];
        //Loop To Insert Array Value
        for(int i=0;i<array.length;i++) {
        	System.out.println("Insert Array Value");
        	array[i]=sc.nextInt();
        }
        int i=0;
        int j=i+1;
        //Loop To Find Pairs
        while(i<=arrayLength-2) {
        	if((array[i]+array[j])%k==0)
        		System.out.println(array[i]+" "+array[j]);
        	j++;
        	if(j==array.length) {
        		i++;
        		j=i+1;
        	}
        }
	}

}

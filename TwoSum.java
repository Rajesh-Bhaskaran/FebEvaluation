package spotAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Total Cost Friends Have");
		int m=sc.nextInt();
		System.out.println("Enter Number of Ice Cream Flavours");
		int flavourLength=sc.nextInt();
		List<Integer>list= new ArrayList<>();
		
		//For Loop To Add Flavour Costs In List
		for(int i=0;i<flavourLength;i++) {
			System.out.println("Enter Flavour Cost");
			list.add(sc.nextInt());
		}
		
		//For Loop To Find  Two Distinct Flavour
		int i=0;
		for(i=0;i<list.size();i++) {
			if(list.contains(m-list.get(i))&&list.indexOf(m-list.get(i))!=i) {
				System.out.println("First Flavour Index = "+(i+1));
				System.out.println("First Flavour Index = "+(list.indexOf(m-list.get(i))+1));
				break;
			}
		}
		
		if(i==list.size())
			System.out.println("No Two Distict Flavour Possible");

	}

}

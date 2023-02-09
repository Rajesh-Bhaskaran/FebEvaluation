package spotAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number n natural Numbers");
		int n=sc.nextInt();
		int[] array=new int[n+1];
		List<Integer>list=new ArrayList<>();
		List<List<Integer>> listoflist=new ArrayList<>();
		
		//For Loop To insert values in Array
		for(int i=0;i<array.length-1;i++) {
			array[i]=i+1;
		}
		
		
		//function To Find Subsets
		findSubsets(0,list,listoflist,array);
		System.out.println(listoflist);

	}

	private static void findSubsets(int i, List<Integer> list, List<List<Integer>> listoflist, int[] array) {
		if(i>=array.length)
			return;
		if(!listoflist.contains(list))
			listoflist.add(new ArrayList(list));
		list.add(array[i]);
		findSubsets(i+1,list,listoflist,array);
		list.remove(list.size()-1);
		findSubsets(i+1,list,listoflist,array);
	}

}

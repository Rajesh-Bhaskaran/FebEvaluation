package spotAssignment;

import java.util.Scanner;

public class PasswordVerifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=sc.nextInt();
		String[]reference=new String[n];
		for(int i=0;i<reference.length;i++) {
			sc.nextLine();
			System.out.println("Enter String Array");
			reference[i]=sc.nextLine();
		}
		System.out.println("Enter Validating String");
		String validating=sc.nextLine();
		
		int i=0;
		for(i=0;i<reference.length;i++) {
			if(validating.contains(reference[i]))
			{
				continue;
			}
			else {
				System.out.println("Wrong PassWord");
				break;
			}
		}
		if(i==reference.length)
			System.out.println(validating);

	}

}

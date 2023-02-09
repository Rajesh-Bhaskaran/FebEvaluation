package spotAssignment;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Matrix Length N");
	int n=sc.nextInt();
	int[][]array=new int[n][n];
	int [][] rotatedArray=new int[n][n];
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		System.out.println("Insert Values In Array");
    		array[i][j]=sc.nextInt();
    	}
    }
    System.out.println("Enter Number Times To Rotate In ClockWise");
    int number=sc.nextInt();
     rotate(array,rotatedArray,number);
	}

	//Method To Rotate Matrix In ClockWise Direction
	private static void rotate(int[][] array,int [][] rotatedArray,int number) {
		while(number>0) {
			int k=0;
			int m=0;
			for(int i=0;i<array.length;i++) {
				for(int j=array.length-1;j>=0;j--) {
					rotatedArray[k][m]=array[j][i];
					m++;
				}
				k++;
				m=0;
			}
			int[][]temp=rotatedArray;
		    array=temp;
		    rotatedArray=new int[array.length][array.length];
			number--;
		}
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array.length;j++) {
					System.out.print(array[i][j]);
				}
				System.out.println();
			}
		}
		
		
		
	}



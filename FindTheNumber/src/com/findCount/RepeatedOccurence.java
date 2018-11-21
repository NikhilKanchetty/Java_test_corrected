package com.findCount;
import java.util.Scanner;
import java.util.ArrayList;

public class RepeatedOccurence {
	
	public void occurence() {

		Scanner s = new Scanner(System.in);
		int count =0,rows = 0, col = 0,R = 0;

		// taking the inputs from the user
		System.out.print("Enter the number of rows and columns for the array\nRows: ");
		rows = s.nextInt();
		System.out.print("Columns: ");
		col = s.nextInt();

		int [][] arr = new int[rows][col];// Creating an array
		ArrayList<String> result = new ArrayList<String>();// one more array to store the result

		// taking the values to be stored in the matrix from the user
		System.out.println("Enter the values into the array");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = s.nextInt();
			}

		}

		// finding the number user wants
		System.out.println("What is the count value ?:");
		R = s.nextInt();

		// finding the repeated count of the number
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
			    int temp = 0;count =0;
				temp = arr[i][j];
				if(true) {
					for(int i1=0; i1<rows; i1++) {
						for(int j1=0; j1<col; j1++) {
							if(temp == arr[i1][j1]) {
								count++;
								if(count == R) {
									result.add(Integer.toString(temp));
								}
							}
						}
					}
				}
			}
		}

		

       // printing the matrix for reference	
		System.out.println("The matrix given is:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
				
		//printing the output
		System.out.println("The Number "+result+" is repeated "+R+" times in the given matrix");
		s.close();

		
	}

	public static void main(String[] args) {
		RepeatedOccurence r = new RepeatedOccurence();
		r.occurence();
	}

}

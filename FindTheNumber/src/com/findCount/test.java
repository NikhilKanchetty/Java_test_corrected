package com.findCount;
import java.util.Scanner;

public class test {

		public void findNum() {

			Scanner s = new Scanner(System.in);
			int num = 0,rows = 0, col = 0,R = 0;

			

			// taking the inputs from the user
			System.out.print("Enter the number of rows and columns for the array\nRows: ");
			rows = s.nextInt();
			System.out.print("Columns: ");
			col = s.nextInt();

			int [][] arr = new int[rows][col];// Creating an array

			// taking the values to be stored in the matrix from the user
			System.out.println("Enter the values into the array");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<col; j++) {
					arr[i][j] = s.nextInt();
				}

			}

			// finding the number user wants
			System.out.println("What is the number you are looking for in the array ?:");
			num = s.nextInt();

			// finding the repeated count of the number
			for(int i=0; i<rows; i++) {
				for(int j=0; j<col; j++) {
					if(arr[i][j] == num) {
					R++;
					}
				}
			}

			

           // printing the matrix for refernce	
			System.out.println("The matrix given is:");
			for(int i=0; i<rows; i++) {
				for(int j=0; j<col; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.print("\n");
			}
					
			//printing the output
			System.out.println("The Number "+num+" is repeated "+R+" times in the given matrix");
			s.close();
		}
	
		public static void main(String[] args) {
			test r = new test();
			r.findNum();
			}

}

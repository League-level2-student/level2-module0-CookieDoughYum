package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] name={"Bob", "Joe", "Emily", "Sophia", "Don"};
		//2. print the third element in the array
		System.out.println(name[2]);
		//3. set the third element to a different value
		name[2]="Nate";
		//4. print the third element again
		System.out.println(name[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		//6. make an array of 50 integers
		
			int[] num=new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random r=new Random();
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(51);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int low=50;
		for(int i=0; i<50; i++) {
			if(num[i]<low) {
				low=num[i];
			}	
		}
		System.out.println(low);
		//9 print the entire array to see if step 8 was correct
		for(int i=0; i<50; i++) {
			System.out.println(num[i]);
		}
		//10. print the largest number in the array.
		int high=0;
		for(int i=0; i<50; i++) {
			if(num[i]>high) {
				high=num[i];
				
			}
			
		}
		System.out.println(high);
	}
}

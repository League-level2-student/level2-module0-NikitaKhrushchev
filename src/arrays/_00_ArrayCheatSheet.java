package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = new String[5];
		
		//2. print the third element in the array
		System.out.println(s[3]);
		//3. set the third element to a different value
		s[3] = "23";
		//4. print the third element again
		System.out.println(s[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		int[] im = new int[50];
		for (int i = 0; i < im.length; i++) {
			Random r = new Random();
			im[i] = r.nextInt(100);
			
		}
		int e = 0;
		int[] a = new int[50];
		int current;
		current = 101;
		int current2 = 0;
		for (int i = 0; i < im.length; i++) {
			if(im[i] < current) {
				current = im[i];
			}
			if(im[i]>current2) {
				current2 = im[i];
			}
		}
		for (int ra = 0; ra < im.length; ra++) {
		System.out.println(im[ra]);
		}
		System.out.println(current);
		System.out.println(current2);
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}

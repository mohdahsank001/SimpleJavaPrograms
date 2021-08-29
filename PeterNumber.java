import java.util.Arrays ; 
import java.util.Scanner ; 
import java.lang.Math; 


/*

Problem Description : 
--------------------------------------

Peter likes numbers. As a meditation exercise, he likes to write down all the numbers starting
with 1 whose digits are sorted in ascending order. For example, 11235888 is such a number. After a
while, he stops.
Write an efficiently designed program which, after entering a number between 1 and 10 ^ 18,
represents the last number checked by Peter, outputs the last number written down by Peter.
Examples:
Input: 23245 Output: 22999
Input: 11235888 Output: 11235888
Input: 111110 Output: 99999
Input: 33245 Output: 29999
Tip: Going through the numbers one by one and testing them is not efficient enough.


solution PETER NUMBER (part of the Application test for Audio cc)
 * Applicant name : Mohammed Ahsan k
 
 * */

public class PeterNumber {
	
	public static void main(String[]args) {
		
		try{
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter the input number") ;
		 boolean complete = true  ;
		 // The input long number here 
		 Long input1 = input.nextLong(); 
		 if (input1 < 0 || input1 > Math.pow(10, 18)) {
			 System.out.println("Invalid Input") ; 
		 }
		 input.close();
		 //System.out.println(input1) ;
		 long [] intArray = compute(input1.toString()) ;
		 //System.out.println(isSorted(intArray)) ;
		
		if (isSorted(intArray)) {
			System.out.println("Input:"+input1+"    Output:"+input1) ;  
		}else {
			Long input2 = input1 ; 
			while(complete == true ) {
				 input1 = input1 - 1  ; 
				 long [] intArray2 = compute(input1.toString()) ;
				if (isSorted(intArray2)) {
					System.out.println("Input:"+input2+"    "+"Output:"+input1) ; 
					complete = false ;
				}
			}
		}
		}catch(Exception e) {
			System.out.println("Invalid Input") ; 
			
		}
	}
	
	// Method to compute the nearest largest number with digits in the increasing order 
	static long[] compute(String input1) {
		
		String[] strArray = input1.split("");
		long[] intArray = new long[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
		    intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray ; 
	}
	
	// Method to check if the input number is already arranged in an ascending order 
	
	static boolean isSorted(long[] array) 
	{ for (int i = 0; i < array.length - 1; i++) { if (array[i] > array[i + 1]) return false; } return true; }
	
}


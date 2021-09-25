import java.util.Scanner ; 
import java.util.Arrays ;
import java.lang.Math  ; 
import java.util.stream.IntStream;
 


public class Solution {
 
 /**
 PROBLEM DESCRIPTION : 

Lily likes to play games with integers. She has created a new game where she determines the difference
between a number and its reverse. For instance, given the number 12, its reverse is 21 . Their difference
is 9. The number 120 reversed is 21, and their difference is 99.

She decides to apply her game to decision making. She will look at a numbered range of days and will
only go to a movie on a beautiful day .

Given a range of numbered days,[i....j] and a number k, determine the number of days in the range
that are beautiful . Beautiful numbers are defined as numbers where |i -reverse(i)| is evenly divisible
by k. If a day's value is a beautiful number, it is a beautiful day. Print the number of beautiful days in the
range.
 
Function Description

Complete the beautifulDays function in the editor below. It must return the number of beautiful days in
the range.
beautifulDays has the following parameter(s):
i: the starting day number
j: the ending day number
k: the divisor 


Input Format

A single line of three space-separated integers describing the respective values of , , and .
 
 Constraints 
 
 1 <= i <= j <= 2 x 10^6 
 1 <= k <= 2 x 10^9
 
 Output Format 
 
 Print the number of beautiful days in the inclusive range between i and j .
 
 
 **/
    
    
    
    public static int[] arr ; 
    public static int val = 0  ; 
    public static int count = 0 ; 
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in) ; 
        
        // Type cast all  of the int into double while computing div. 
        
        
        /*
        Type cast sample usage   : 
        ------------------------
        
            int myInt = 9;
            double myDouble = myInt; // Automatic casting: int to double

            System.out.println(myInt);      // Outputs 9
            System.out.println(myDouble);   // Outputs 9.0
        
        BugHere :
        ----------
        Approach 1 (Current) : 
           int a = 9 ; 
           int b = 6 ; 
        
           double div = a/b ; 
        
           System.out.println(div) ; 
        OUTPUTS : 1.0
        
        Approach 2 (Update to this -- By typecasting all int to double )
           div a = 9 ; 
           div b = 6 ; 
        
           double div = a/b ; 
        
           System.out.println(div) ; 
        OUTPUTS : 1.5 
      
        */
        
        // The starting day number 
        int i = input.nextInt() ; 
        // The ending day number 
        int j = input.nextInt() ; 
        // The divisor 
        int k = input.nextInt() ; 
        
        // To compute the number of elements between i and j . 
        for (int a=i; a<j+1 ; a++){
        val++ ;      
         }
        
        // Size of the array is equal to the number of elements between i and j 
        int arr1 [] = new int[val] ; 
        
        // Adding elements between i and j to the array myArray - Using Intstream. 
        int[] myArray = IntStream.range(i, j).toArray();
      
      // reverse a number 
        
      for (int x=i ; x<j+1 ; x++){ 
        int number = x ; 
        int reverse = 0;  
        
        while(number != 0)   
                    {     
                    int remainder = number % 10;  
                    reverse = reverse * 10 + remainder;  
                    number = number/10;  
                    } 
                     
       
        
        //int myInt = 9;
        //double myDouble = myInt;
        
        int diff = Math.abs(x - reverse) ;
        
        // Type Casting. 
        
        double diffu = (double) diff ;
        double ku = (double) k ; 
        

        double div = Math.abs(diffu / ku) ;

        
        if (div % 1 == 0){
            count ++ ; 
        }
      }
      
      
    System.out.println(count) ; 

       
    }
    
    
    
    
}

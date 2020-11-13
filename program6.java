// Program to calculate and print the sum of the elements in an array


// To eliminate the overflow that might happen . 
// Convert the type of sum to long to eliminate overflow . 

// Program to compute the sum of very large integer values. 


import java.util.Scanner ; 
import java.util.* ; 




public class test1{


    public static long sum = 0 ; 
    


        public static void main (String[]args){


            Scanner input = new Scanner(System.in);
            int n = input.nextInt() ; 

            int arr[] = new int [n] ; 

            for (int j=0; j<arr.length; j++){

                arr[j] = input.nextInt() ; 
                sum = sum + arr[j] ; 

                
            }

            
            

            System.out.println(sum); 
            //System.out.println(Arrays.toString(arr)); 

        }







}

import java.io.*;
import java.util.Scanner ; 

public class test1 {


    // Please rename the java file to .test1 before executing 
    // Program to compute the frequency of positive, negative and zero elements in an array. 
    
    
    public static int n ; 
    public static double sum ; 
    public static double pluscount = 0 ; 
    public static double negacount = 0  ; 
    public static double zerocount = 0 ; 
    
    public static double posifreq ; 
    public static double negfreq ; 
    public static double zerofreq ; 

    public static void main (String[]args){

        Scanner input = new Scanner(System.in) ; 

        n = input.nextInt() ; 

        double arr1[] = new double[n] ;
      
        for (int i=0 ; i<arr1.length ; i++){
            
            arr1[i] = input.nextDouble() ; 

        } 


        for (int i=0 ; i<arr1.length ; i++){

            sum = arr1[i] ; 
            
            
            if (sum>0){

                pluscount ++ ; 

            }

            else if(sum == 0) {

                zerocount ++ ; 

            }

            else  {

                negacount ++ ; 
            }
            
            /*
            
             negfreq = negacount/n ; 
             zerofreq = zerocount/n  ; 
             
             */
        }

        posifreq = pluscount/n ; 
        negfreq = negacount/n ;
        zerofreq = zerocount/n ; 

   
        System.out.printf("%6f\n",posifreq) ; 
        System.out.printf("%6f\n",negfreq) ; 
        System.out.printf("%6f",zerofreq) ; 

    }
}

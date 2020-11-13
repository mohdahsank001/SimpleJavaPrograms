

import java.util.Scanner ; 
import java.util.* ; 
import java.lang.Math ; 

public class test1{

//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

public static int n ; 
public static int total ; 


    public static void main (String[]args){

            Scanner input = new Scanner(System.in) ; 

            // the variable n used to take in the matrix dimensions 

            n = input.nextInt() ; 
            int arr1[][] = new int[n][n] ; 

    for (int i=0 ; i<n ; i++ ){
            for (int j=0 ; j<n ; j++){

                    arr1[i][j] = input.nextInt() ; 
            }
    }


    for (int row = 0 ; row < arr1.length ; row++){

        total = (total + arr1[row][row] -
        arr1[row][arr1.length - row-1])*(-1)*(-1) ; 
    }


    System.out.println(Math.abs(total)) ; 



    }







}

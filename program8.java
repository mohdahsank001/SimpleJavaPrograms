
import java.io.* ; 
import java.util.Scanner ; 

public class compute {

// Java program to compute the simple sum of an array 
public static int sum = 0 ; 

public static void main (String[]args){

     
    Scanner input = new Scanner(System.in) ;
    int n = input.nextInt() ;
    int array[] = new int[n];


    for (int i = 0 ; i<n ; i++){

        array[i] = input.nextInt();
        sum =  sum + array[i] ;

    }

System.out.println(sum) ; 


}



}

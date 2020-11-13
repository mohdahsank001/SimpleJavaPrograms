import java.io.*;
import java.util.Scanner  ; 
import java.util.Arrays   ;


public class Solution {

// Java program to compute max and min sum that can be obtained using elements in an array 

public static long sum = 0 ; 
public static long sum1 = 0 ; 

public static void main (String[] args){

Scanner input = new Scanner(System.in); 

long arr1[] = new long[5] ; 

for (int i=0; i<arr1.length; i++){

arr1[i] = input.nextInt() ; 

}

Arrays.sort(arr1);

for(int i=0; i<4; i++){
sum = sum + arr1[i];
}
System.out.print(sum+" ");

for (int i=1 ; i<5;i++){
sum1 = sum1 + arr1[i];
}
System.out.print(sum1);

}
}

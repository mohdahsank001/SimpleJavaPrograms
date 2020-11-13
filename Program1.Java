import java.util.Arrays ; 
import java.util.Scanner ; 



public class Solution {

	// Java program to count the frequency of max elements in an array 
    
    public static int n ; 
    public static int count = 0 ;
    public static int maxelement ; 
    
    public static void main(String[]args) {
    
        Scanner input = new Scanner(System.in) ; 
        
        //System.out.println("Whats the array size") ; 
        n = input.nextInt() ; 
        int arr1[] = new int[n];
        
        
        //System.out.println("Whats the array elements") ;     
        for (int i=0 ; i<arr1.length ; i++) {        
        arr1[i] = input.nextInt();    
        }
        
        Arrays.sort(arr1);

         maxelement = arr1[arr1.length-1 ];
        //System.out.println(maxelement) ; 
        
        for (int i=0;i<arr1.length; i++) {
            
            if (arr1[i] == maxelement) {
                
                count ++ ; 
                
            }
            
        }
        
        System.out.print(count);

        
        
    }
    
    
    
    
    
}

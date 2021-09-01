import java.util.Scanner ; 


Solution to BonAppetit problem on Hackerrank 
// Kindly rename the file as Solution.java before executing. 

public class Solution {
    
    public static int totalbill = 0 ; 
    
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in) ;
          
        // n is the number of items ordered
        int n = input.nextInt()  ; 
        // k is the 0 based index of item that anna did not eat ,  only at one index. 
        int k = input.nextInt()  ; 
        
        
        int []arr1 = new int[n] ; 
        // arr1 consists of all the bill values. 
        for (int i=0 ; i<arr1.length ; i++){
            arr1[i] = input.nextInt() ; 
        }
        
//b is the amount of money that anna paid for the bill or the money brian charged anna. 
        int b = input.nextInt() ; 

        
        // Compute the total sum - traverse through the array. 
        for (int j=0; j<arr1.length ; j++){  
            totalbill += arr1[j] ; 
        }
        
        
        int annabill1 = totalbill - arr1[k] ; 
        int annabill2 = annabill1/2 ;    // Anna pays half of what she did not eat.
        
        if (b == annabill2) {
            System.out.println("Bon Appetit") ; 
            
        } else if (b > annabill2){
            
         int updatedbill = b - annabill2 ; 
         System.out.println(updatedbill) ;    
        }
        
         
        /*  TESTING */ 
        // System.out.println(n) ; 
        // System.out.print(k) ; 
        // System.out.println(arr1[2]) ; 
        // System.out.println(totalbill) ; 
        //System.out.println(annabill2) ;
        //System.out.println(b) ; 

        
    }
    
    
    
}

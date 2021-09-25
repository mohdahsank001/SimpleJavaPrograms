import java.util.Scanner; 
import java.util.Arrays  ; 

// This is the solution for the apple orange problem . 

public class AppleandOrange {
    
    public static int[] oranges ; 
    public static int[] apples ; 
    public static int applefall ; 
    public static int orangefall ; 
    //public static int s ; 
    //public static int t ; 
    public static int output ; 
    public static int count1 ; 
    public static int count2 ; 
    // public static int appledist = 4 ; 
    // public static int orangedist = 12 ; 
    
    /*
     * s- starting location of sam's house
     * t - ending location of sam's house
     * a - location of the apple tree
     * b - location of the orange tree
     * apples - integer array which would contain distance at which 
     * each apple would fall from the tree
     * oranges - integer array which contain the distances at which the 
     * orange would fall from the tree 
     * 
     * */
    
    public static void main(String[]args) {
    
        Scanner input = new Scanner(System.in);
        
        //System.out.println("Enter s");
        int s = input.nextInt() ;  // starting location of sam's house
        //System.out.println("Enter t");
        int t = input.nextInt() ;  // ending location of sam's house
        //System.out.println("Enter a");
        int a = input.nextInt() ;  // location of the apple tree
        //System.out.println("Enter b");
        int b = input.nextInt() ;  // location of the orange tree
        //System.out.println("Enter m");
        int m = input.nextInt() ;  // number of apple distances( to be put in the array).
        //System.out.println("Enter n");
        int n = input.nextInt() ;  // number of orange distances(to be put in the array). 
        
         oranges = new int[n] ; 
         apples = new int[m] ; 
        
         //apple fall at = apple array element distance + position of the tree.    
         // orange fall at = orange array element distance + position of the tree.  

        for (int i=0; i<m; i++) {
            apples[i] = input.nextInt()   ;
        }

        for (int i=0; i<n; i++) {
            oranges[i] = input.nextInt() ; 
        }

        // Output : Distances at which apple and orange would fall.
        
       //apple fall at apple array element distance + position of the tree.    
        for (int j=0; j<apples.length; j++) {
          apples[j] = apples[j] + a  ; 
           
          if ((apples[j]>=s) && apples[j]<=t) { 
                //System.out.println(apples[j]); 
                count1++ ;   
          }
        } 
        // orange fall at orange array element distance + position of the tree.  
        
        for (int i=0 ; i<oranges.length; i++) {
         oranges[i] = oranges[i] + b ;    
         if ((oranges[i]>=s) && (oranges[i] <=t)) {
                 //System.out.println(oranges[i]);   
                 count2++ ; 
             }
             }
           
        /*
         * If the apples and oranges would fall in the sams house location then print  
         * number of apples and oranges. 
         * If they would fall between s and t. 
         * */
        
       System.out.println(count1); 
       System.out.println(count2);
       
       
       
    }

}

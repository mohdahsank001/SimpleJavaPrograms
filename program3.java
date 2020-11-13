import java.io.*  ;
import java.util.Scanner ; 



// Java program to print the half pyramid pattern. 

/*
This program would print this pattern : 

   #
  ##
 ###
####



*/



public class test1{
    
    public static int j ; 
    
    public static void main (String[]args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() ; 
        
        
        
        StringBuilder builder = new StringBuilder() ;
        
        for (int i = 0 ; i<n ; i++) {
            builder.append(" ");
             j=0 ; 
        }
            
            for (int i=1; i<=n ; i++) {
                
                builder.replace(builder.length()-i,builder.length()-j, "#");
                System.out.println(builder);
                j++ ; 
                
                
            }    
            
        }    
        
    }
    
    
    
    
    
    
    
    
    
    

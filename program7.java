import java.util.Scanner ; 
import java.util.*  ;


// Simple java Program to compare the elements of an array  

public class test1 {

    public static int alicepoint = 0 ;
    public static int bobpoint = 0 ; 


    public static void main(String[]args){

        int arr1[] = new int[3];
        int arr2[] = new int[3] ; 

        Scanner input = new Scanner(System.in) ; 

       // System.out.println("Enter input values for the first array");
        for (int i=0; i<arr1.length; i++){
            arr1[i] = input.nextInt() ; 
        }    

        
        //System.out.println("Enter input values for the second array"); 
        for (int j=0 ; j<arr2.length; j++){
            arr2[j] = input.nextInt() ; 
        }


        for (int i=0; i<arr1.length ; i++){

                if (arr1[i]>arr2[i]){
                    
                    alicepoint++ ; 

                }else if (arr2[i]>arr1[i]){

                    bobpoint++ ; 

                }
            
            
            
        }
        

        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));

     System.out.println(alicepoint +" "+bobpoint) ; 

        
    }
    

    
    
    

        


}

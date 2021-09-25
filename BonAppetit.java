import java.util.Scanner ; 


Solution to BonAppetit problem on Hackerrank 
// Kindly rename the file as Solution.java before run. 

/**

PROBLEM DESCRITPTION : 

Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they
consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2,4,6]. Anna declines to eat item k = bill[2] which costs 6. 
If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3. If he includes the cost of bill[2], he will
calculate (2+4+6)/2 = 6.In the second case, he should refund to Anna.

Function Description
Complete the bonAppetit function in the editor below. It should print "Bon Appetit" if the bill is fairly split.
Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

bill: an array of integers representing the cost of each item ordered
k: an integer representing the zero-based index of the item Anna doesn't eat
b: the amount of money that Anna contributed to the bill


Input Format

The first line contains two space-separated integers n and k, the number of items ordered and the 0-based index of
the item that Anna did not eat.
The second line contains space-seperated integers bill[i] where 0<= i < n.
The third line contains an integer,b,the amount of money that Brian charged Anna for her share of the bill.

Constraints 

2<= n <= 10^5 
0 <= k < n 
0 <= bill[i] <= 10^4 
0 <= b < i from 0 to n - 1 sum of bill[i]
The amount of money due Anna will always be an integer

Output Format

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e.,
b-charged - b-actual) that Brian must refund to Anna. This will always be an integer.

**/


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

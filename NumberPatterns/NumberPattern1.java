
import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String args[])   
    {   
        int i, j,number; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of Numbers :");
        int n=sc.nextInt();
 
        for(i=0; i<n; i++)  
        {   
            number=1;   
 
        for(j=0; j<=i; j++)  
        {   
 
            System.out.print(number+ " ");   
            number++;   
        } 

        System.out.println();  

        }   
    }   
}  


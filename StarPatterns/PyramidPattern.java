import java.util.Scanner;

public class PyramidPattern  
{    
public static void main(String args[])   
{    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter rows to be printed :");
    int i, j, row = sc.nextInt();       
 
    for (i=0; i<row; i++)   
    {   
        for (j=row-i; j>1; j--)   
    {  
 
    System.out.print(" ");   
}   

for (j=0; j<=i; j++ )   
{   
     System.out.print("* ");   
}   
    System.out.println();   
}   
}   
}

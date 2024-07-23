import java.util.Scanner;

public class RightTrianglePattern {

    public static void main(String args[])   
{   
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter rows to be Printed : ");
    int i, j, row=sc.nextInt();   
 
    for(i=0; i<row; i++)   
{   

    for(j=0; j<=i; j++)   
{   
   
    System.out.print("* ");   
}   
    System.out.println();   
}   
}   
}  


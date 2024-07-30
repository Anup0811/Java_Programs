import java.util.Scanner;

public class CharacterTriangle2
{
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows you want to print :");
        int rows=sc.nextInt();
        int letter = 65;  
  
        for (int i = 0; i<= rows; i++)  
        {  
            for (int j = 0; j <= i; j++)  
            {  
                System.out.print((char) letter + " ");  
            }  
            letter++;  
        System.out.println();  
        }  
    }  
} 


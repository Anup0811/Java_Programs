import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        
        int num;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number :");
        num=sc.nextInt();

        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is equal to Zero");
        }
    }
}


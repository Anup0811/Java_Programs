import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        
        int num,rem,temp,sum=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number :");
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}


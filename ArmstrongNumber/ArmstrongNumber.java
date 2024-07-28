import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
       
        int sum=0,rem,temp;
        temp=num;

        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            sum = rem*rem*rem + sum;
        }

        if(temp == sum)
        {
            System.out.println(temp+" is a Armstrong Number");
        }
        else
        {
            System.out.println(temp+ " is not a Armstrong Number");
        }
        sc.close();
    }
}

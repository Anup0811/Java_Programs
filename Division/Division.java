import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        
        int num1,num2,div;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first Number :");
        num1=sc.nextInt();

        System.out.println("Enter second Number :");
        num2=sc.nextInt();

        div=num1/num2;
        System.out.println("Division is :"+div);

    }
}


import java.util.Scanner;

public class Substraction {
    public static void main(String[] args) {
        int a,b,sub;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first Number :");
        a=sc.nextInt();

        System.out.println("Enter Second Number :");
        b=sc.nextInt();

        sub=a-b;
        System.out.println("Substraction is:"+sub);
        sc.close();

    }
}


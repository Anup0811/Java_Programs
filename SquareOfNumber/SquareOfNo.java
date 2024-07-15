import java.util.Scanner;

public class SquareOfNo {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int num= sc.nextInt();
        int sq;

        sq= num * num;
        System.out.println("Square of "+num+" is "+sq);

    }
    
}


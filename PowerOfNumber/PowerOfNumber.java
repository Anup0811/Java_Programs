import java.util.Scanner;

public class PowerOfNumber {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

System.out.print("Enter base :");
int base = sc.nextInt();

System.out.print("Enter exponent : ");
int exponent = sc.nextInt();

 long result = 1;

 while (exponent != 0) {

 result = result * base;

 -- exponent;

 }

 System.out.println("The Power of Number is : " + result);

 sc.close();

 }

}

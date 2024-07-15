import java.util.Scanner;

public class CubeOfNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int cube;

        cube = num * num * num;

        System.out.println("Cube of "+num+" is "+cube);
    }
    
}


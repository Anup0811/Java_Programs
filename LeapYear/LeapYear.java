import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        int year;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Year :");
        year=sc.nextInt();

        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))
        {
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is not Leap Year");
        }
    }
}


import java.util.*;

public class Addition {
   public static void main(String[] args) {
       int a,b,sum;

      Scanner sc=new Scanner(System.in);
       System.out.println("Enter first Number :");
      a=sc.nextInt();
    
       System.out.println("Enter Second Number :");
      b=sc.nextInt();
       
       sum=a+b;
      System.out.println("Addition is :"+sum);
       sc.close();

   }
 
}

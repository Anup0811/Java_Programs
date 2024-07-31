package Single_Inheritance;

public class Student {
    int rollno;
    String name;
    String grade;
    
   public Student(int rollno,String name,String grade)
    {
        this.rollno=rollno;
        this.name=name;
        this.grade=grade;
    }
    
   void displayStudInfo()
    {
        System.out.println("\nRoll No :"+rollno+" \nStudent Name :"+name+" \nGrade :"+grade);
        
    }
    
}

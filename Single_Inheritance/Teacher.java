package Single_Inheritance;

class Teacher extends Student {

    float sal;
    String Tname;
    
    Teacher(int rollno,String name,String grade,float sal, String Tname)
    {
        super(rollno,name,grade);
        this.sal=sal;
        this.Tname=Tname;
    }
    
    void displayTechInfo()
    {
        System.out.println("Salary :"+sal+" \nTeacher Name :"+Tname);
    }
    
}

class Student
{
    String name;
    int rn;
    Student (String n,int r)
    {
        name=n;
        rn=r;
    }
   
}
class Main
{
     public static void main (String[] args) {
        Student s1= new Student("Vartika", 41);
        System.out.println(s1);
     }
  
}


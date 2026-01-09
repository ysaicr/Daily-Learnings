class Student
{
    int age;
    String name;
    float marks;


}
public class Variable9
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.age=23;
        s1.name="Balaji";
        s1.marks=75;
        Student s2=new Student();
        s2.age=22;
        s2.name="keys";
        s2.marks=90;
        Student s3=new Student();
        s3.age=21;
        s3.name="Technologies";
        s3.marks=95;
        Student s=new Student();
        s.age=24;
        s.name="Sai";
        s.marks=99;
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.marks);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s3.age);
        System.out.println(s3.name);
        System.out.println(s3.marks);


    }
}


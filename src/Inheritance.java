class Animal{
    String name;
    int age;
    void eat()
    {
        System.out.println("food");

    }
    void sleep()
    {
        System.out.println("sound");
    }

}
class Dog extends Animal{
    void barking()
    {
        System.out.println("bow bow");
    }
}
class Cat extends Animal{
    void mewow() {
        System.out.println("Sound");
    }
}
class A
{
    public static void main(String[] args)
    {
        Dog s=new Dog();
        s.name="snoopy";
        System.out.println("name:"+s.name);
        s.age=2;
        System.out.println("age:"+s.age);
        s.eat();
        s.sleep();
        s.barking();
        Cat w=new Cat();
        w.name="rosey";
        System.out.println("name:"+s.name);
        w.age=1;
        System.out.println("age:"+s.age);
        w.eat();
        w.sleep();
        w.mewow();
    }
}
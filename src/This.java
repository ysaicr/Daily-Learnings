 class This {
    String name;
    String name1;
    void sayHello(String name, String name1){
        this.name=name;
        this.name1=name1;
        System.out.println("hello");
    }
}
class With1{
    public static void main(String args[]){
        This o= new This();
        o.sayHello("Sai","sai");
        System.out.println(o.name +" "+ o.name1);
    }
}

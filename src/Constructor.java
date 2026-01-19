 class Constructor {
    String name;
    int age;
    int rllno;
    Constructor (String n, int a, int b){
        name=n;
        age=a;
        rllno=b;
    }
}
 class Constructor1{
    public static void main(String args[]){
        Constructor s1=new Constructor("Sai",22, 101);
        Constructor s2=new Constructor("adhi",23,102);
        Constructor s3=new Constructor("sujan",18,104);
        System.out.println(s1.name + - + s1. age + - + s1.rllno);
        System.out.println(s2.name + - + s2. age + - + s2.rllno);
        System.out.println(s3.name + - + s3. age + - + s3.rllno);;


    }

 }


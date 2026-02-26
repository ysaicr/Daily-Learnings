 class Argument {
    int a=25;
    int b=30;
    int Addition(){
         ////  System.out.println("Hello");
        return a+b;

    }
}
class Argument1{
    public static void main(String args[]){
        Argument k=new Argument();
        int x=k.Addition();
        System.out.println(x);
    }
}

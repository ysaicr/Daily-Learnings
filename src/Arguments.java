class Greeting4{

     int Addition(int x, int b) {
       ///// System.out.println("Hello!");
         return x+b;
    }
}

class Main4 {
    public static void main(String[] args) {

        Greeting4 obj_1 = new Greeting4();
        int Addition= obj_1.Addition(18,15);
       System.out.println(Addition);
    }
}
/// With Arguments and With return value
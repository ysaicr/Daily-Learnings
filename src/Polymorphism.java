class Overloading {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}
class Poly{
    public static void main(String[] args) {
        Overloading p = new Overloading();
        System.out.println("Add:"+p.add(10, 25));
        System.out.println("Double:"+p.add(10.00, 25.2500));
        System.out.println("float:"+p.add(10.0, 25.2));

    }
}

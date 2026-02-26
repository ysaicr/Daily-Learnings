class Leapyear {
    public static void main(String[] args) {
        int a = 2024;
        int b = 2023;
        if (a % 4 == 0) {
            System.out.println(a +"Leap year");
        } else {
            System.out.println(a + "non leap year");
        }
        if (b % 4 == 0) {
            System.out.println(b  + "Leap year");
        } else {
            System.out.println(b  + "non leap year");
        }
    }
}
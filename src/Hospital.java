 class Patient {
    String namee;
    int Id;
    String disease;

}
public class Hospital{
    public static void main(String[] args)
    {
        Patient s1=new Patient();
        s1.namee="Sai";
        s1.Id=256;
        s1.disease="fever";
        Patient s2=new Patient();
        s2.namee="Jagan";
        s2.Id=268;
        s2.disease="cough";
        Patient s=new Patient();
        s.namee="Jagan";
        s.Id=268;
        s.disease="cough";
        System.out.println(s.namee);
        System.out.println(s.Id);
        System.out.println(s.disease);
        System.out.println(s1.namee);
        System.out.println(s1.Id);
        System.out.println(s1.disease);
        System.out.println(s2.namee);
        System.out.println(s2.Id);
        System.out.println(s2.disease);


    }
}

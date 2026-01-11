class Sim1 {
    String name;
    int Id;
    String server;

}
public class Sim {
    public static void main(String[] args){
        Sim1 a=new Sim1();
        a.name="Airtel";
        a.Id=01;
        a.server= "4G";
        Sim1 b = new Sim1();
        b.name="jio";
        b.Id=02;
        b.server="3G";
        Sim1 c= new Sim1();
        c.name="bsnl";
        c.Id=03;
        c.server="2G";
        System.out.println(a.name);
        System.out.println(a.Id);
        System.out.println(a.server);
        System.out.println(b.name);
        System.out.println(b.Id);
        System.out.println(b.server);
        System.out.println(c.name);
        System.out.println(c.Id);
        System.out.println(c.server);


    }

}


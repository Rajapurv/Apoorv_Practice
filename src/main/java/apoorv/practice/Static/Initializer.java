package apoorv.practice.Static;

public class Initializer {

    static int initialValue ;
    static {
        initialValue = 1000;
        System.out.println("initialValue: " + initialValue);
    }
    {
        System.out.println("initialValue: " + initialValue + 1);
    }
    public static void  main(String[] args) {
        System.out.println("Test");
        Initializer i1 = new Initializer();
        initialValue = 3000;
        System.out.println("initialValue: " + i1.initialValue);
    }
}

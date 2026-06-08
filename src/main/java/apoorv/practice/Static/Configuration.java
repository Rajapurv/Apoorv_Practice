package apoorv.practice.Static;

public class Configuration {
    protected static String configval;

    static {
        System.out.println("Loading configuration...");
        configval = "New Configuration";
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Configuration.configval);

    }
}

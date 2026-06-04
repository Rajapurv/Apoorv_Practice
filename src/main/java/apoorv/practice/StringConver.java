package apoorv.practice;

public class StringConver {
    public static void main(String[] args) {
        try {
            String s1 = new String();
            s1 = "abc";
            Integer.parseInt(s1);
        }catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}

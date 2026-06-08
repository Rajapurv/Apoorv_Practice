package apoorv.practice.Static;
import java.util.Scanner;

public class Costants {
   private static final double pi = 3.14159;
   protected double area(int radius){
       return pi * (radius * radius);
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Costants costants = new Costants();
       System.out.print("Enter radius: ");
       System.out.println("Area of the Circle is : " + costants.area(sc.nextInt()));
   }
}

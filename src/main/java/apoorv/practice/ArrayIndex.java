package apoorv.practice;

import java.util.Scanner;

public class ArrayIndex {
    public void arrayIndex(){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        try{
            System.out.println("Enter index: ");
            int  i  = input.nextInt();
            System.out.println(arr[i]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter index: ");
    }
    public static void main(String[] args){
        ArrayIndex arrayIndex = new ArrayIndex();
        arrayIndex.arrayIndex();

    }
}

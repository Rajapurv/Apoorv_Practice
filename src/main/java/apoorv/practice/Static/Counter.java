package apoorv.practice.Static;

public class Counter {
    public static int count;
    public Counter() {
        count += 1;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();
        System.out.println(Counter.count);
        System.out.println(MathUtility.add(10, 60));
    }
}

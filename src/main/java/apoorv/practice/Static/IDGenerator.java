package apoorv.practice.Static;

public class IDGenerator {
    private static int nextId;
    public static int generateId() {
        nextId++;
        return nextId;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateId());
        }

    }
}

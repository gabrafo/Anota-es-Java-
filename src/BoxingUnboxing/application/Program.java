package BoxingUnboxing.application;

public class Program {
    public static void main(String[] args) {
        int x = 20;

        // Object obj = x; // Boxing
        Integer obj = x; // Boxing usando Wrapper Classes

        System.out.println(obj);

        // int y = (int)obj; // Unboxing
        int y = obj; // Unboxing

        System.out.println(y);
    }
}
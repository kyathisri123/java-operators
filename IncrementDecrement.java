package Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Original x: " + x);
        System.out.println("Post Increment: " + (x++));
        System.out.println("After Post Increment x: " + x);
        System.out.println("Pre Increment: " + (++x));
        System.out.println("Post Decrement: " + (x--));
        System.out.println("After Post Decrement x: " + x);
        System.out.println("Pre Decrement: " + (--x));
    }
}


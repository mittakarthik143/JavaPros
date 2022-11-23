public class MathMethods {
    public static void main(String[] args) {
        // Get max value from two numbers
        System.out.println("Max value is - "+Math.max(10, 8));
        // Get min value from two numbers
        System.out.println("Min value is - "+Math.min(10, 8));
        // Square root of value
        System.out.println("Square Root of value is - "+Math.sqrt(64));
        System.out.println("Square Root of value is - "+Math.sqrt(100));
        System.out.println("Square Root of value is - "+Math.sqrt(23));
        // Make negative value to possitive value
        System.out.println("Absolute value is - "+Math.abs(-4.3));
        System.out.println("Absolute value is - "+Math.abs(-4));
        // To get random value from 0 to 1
        System.out.println("Random value is - "+Math.random());
        // To get random value from 0 to 100
        int val = (int)(Math.random()*101);
        System.out.println("Random value is - "+val);
    }
}
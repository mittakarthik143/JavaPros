public class MethodEx {
    // Sample method
    static void myMethod() {
        System.out.println("Hello World!");
    }
    // Method with parameters
    static void paramsMethod(String fname) {
        System.out.println(fname+" Ram");
    }
    // Method with multiple parameters
    static void paramsMulMethod(String name, int age) {
        System.out.println(name+" "+age);
    }
    // Method with return statement of string type
    static String returnStr(String name) {
        return name;
    }
    // Method with returns statement of int type
    static int returnInt(int age) {
        return age;
    }
    // Method adding two numbers and returning
    static int add(int x, int y) {
        return x+y;
    }
    // Method Overloading
    static double add(double x, double y) {
        return x+y;
    }
    // Recursive method
    static int sum(int k) {
        if (k>0) {
            //System.out.println(k);
            return k+sum(k-1);
        } else {
            //System.out.println(k);
            return 0;
        }
    }
    // Recursive method to get factorial value
    static int factorial(int k) {
        if (k!=0) {
            return k*factorial(k-1);
        } else {
            return 1;
        }
    }
    static int addition(int s, int e) {
        if (e>s) {
            return e+addition(s,e-1);
        } else {
            return e;
        }
    }
    public static void main(String[] args) {
        System.out.println("Calling the \"myMethod\" function...");
        myMethod();
        myMethod();
        myMethod();
        paramsMethod("Sai");
        paramsMulMethod("Sai Ram", 24);
        System.out.println(returnStr("SAI RAM"));
        System.out.println(returnInt(24));
        System.out.println(add(10,20));
        int z = add(10, 20);
        System.out.println(z+20);
        System.out.println(add(2.3, 4.5));
        System.out.println(sum(10));
        System.out.println(factorial(5));
        System.out.println(addition(5,10));
    }
}
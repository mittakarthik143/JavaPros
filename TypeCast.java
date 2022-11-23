public class TypeCast {
    public static void main(String[] args) {
        // Widening Casting
        int myNum = 10;
        double myDb = myNum;
        System.out.println(myDb);   
        
        // Narrow Casting
        int val = (int) myDb;
        System.out.println(val);
    }
}
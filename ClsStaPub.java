public class ClsStaPub {
    static void myStMethod(){
        System.out.println("Static method without creating object, we can call");
    }
    
    public void myPuMethod() {
        System.out.println("Public method with creating object, we can call");
    }
    
    public static void main(String[] args) {
        myStMethod();
        ClsStaPub obj = new ClsStaPub();
        obj.myPuMethod();
    }
}
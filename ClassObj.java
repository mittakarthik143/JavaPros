public class ClassObj {
    int x=10;
    final int y=25;
    
    public static void main(String[] args) {
        ClassObj obj = new ClassObj();
        System.out.println(obj.x);
        obj.x = 15;
        System.out.println(obj.x);
        ClassObj obj1 = new ClassObj();
        System.out.println(obj1.y);
        //obj1.y = 30; getting error why means it finalized and can't editable
        //System.out.println(obj1.y);
    }
}
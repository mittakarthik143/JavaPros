public class ClsCons {
    int x;
    
    /* Empty constructor
    public <ClassName>() {
        //declare variables
        x=5;
    }*/
    public ClsCons(int y) {
        x=y;
    }
    
    public static void main(String[] args){
        ClsCons obj = new ClsCons(5);
        System.out.println(obj.x);
    }
}
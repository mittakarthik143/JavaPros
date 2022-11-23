public class JenkinsHello {
    static void helloMsg(){
        System.out.println("Welcome To Java...");
    }
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println("Hello World..."+i);
            helloMsg();
        }
    }
}
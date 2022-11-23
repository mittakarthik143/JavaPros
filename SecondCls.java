class SecondCls {
    /* suppose static methods in same class, we can call if those are 
    in one class and using into another class we can't use 
    If method is public, we can access where ever we want with 
    help of object */
    static void carPrice() {
        System.out.println("Car Price is 16Lakhs");
    }
    
    public static void main(String[] args) {
        carPrice();
        //carPrice1();
        FirstCls obj = new FirstCls();
        obj.carStatus();
        obj.carSpeed(130);
    }
}
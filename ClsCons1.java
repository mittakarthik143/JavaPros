public class ClsCons1 {
    int carModelYear;
    String carModel;
    
    public ClsCons1(int year, String model) {
        System.out.println("It is a constructor...");
        carModelYear = year;
        carModel = model;
    }
    public static void main(String[] args) {
        ClsCons1 obj = new ClsCons1(2016, "XL6");
        System.out.println("Car Model is - "+obj.carModel+"\nCar Model year is - "+obj.carModelYear);
    }
}
package Java;

public class Obj {
	String color;
    int speed;

    void drive() {
        System.out.println("The car is driving.");
    }
    public static void main(String[] args)
    {
// Creating an object of the Car class
Obj myCar = new Obj();
myCar.color = "Red";
myCar.speed = 120;
myCar.drive();  

}
}

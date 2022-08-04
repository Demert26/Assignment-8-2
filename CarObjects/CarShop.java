package CarObjects;


import java.util.Scanner;

public class CarShop {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car car1 = new Car("Subaru","Impreza","Sport","White",2022);
        Car car2 = new Car("Hyundai", "Kona", "Red", 2019);
        Car car3 = new Car("Toyota", "Civic", "Green");
        Car car4 = new Car("Subaru","Impreza","Sport","White",2022);


        car1.make();
        car1.type();
        car1.model();
        System.out.println(car1.getyear() );

        String carString = car1.toString();
        System.out.println(carString);

        car3.make();
        System.out.println(car3.getyear());
        car3.type();
        car3.old(2000);

        System.out.println(car1.hashCode() == car4.hashCode()  );
        System.out.println(car1.equals(car4));

        System.out.println("Not the same Car" + "\n" + car1.equals(car3));














    }
    }


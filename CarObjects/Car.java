package CarObjects;


public class Car {

    String make;
    String model;
    String type;
    String color;
    int year;

    public Car(String make, String model, String type, String color, int year) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;

    }
    public Car(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = "Basic";
        this.year = 2000;

    }
    public Car(String make, String model, String color, int year){
        this.make =make;
        this.model = model;
        this.color = color;
        this.type = "basic";
        this.year = year;

    }
    void make() {
        System.out.println(this.make);
    }
    int getyear (){ return this.year;}

    void type(){
        System.out.println(this.type);
    }

    void old(int year) {
        System.out.println(this.make + " " +year + "\nOlder than 2010, car is recommended for replacement");
    }

    public void model() {
        System.out.println(this.model);

    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString(){
        String returnValue = "";
        returnValue += "The make of this car is" + " " + this.make + "," + " ";
        returnValue += "This car is brand new" + " " + this.getyear();
        returnValue += "\nEnjoy your new car";
        return returnValue;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        if(!this.make.equals(other.make)) return false;
        if(!this.model.equals(other.model))return false;
        if (!this.color.equals(other.color))return false;
        if (!this.type.equals(other.type))return false;
        if (this.year != other.year)return false;
        return true;

    }
    @Override
    public int hashCode () {
        return make.hashCode() + model.hashCode();
    }



}

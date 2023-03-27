package models;

public class Car extends Vehicle{
    private int numberOfDoors;


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String model, int speed, int numberOfDoors) {
        super(model, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String opis()
    {
        System.out.println("Model: "+ this.getModel() +" Prędkość: "+ this.getSpeed()+" Ilość drzwi: "+this.numberOfDoors);
        return "";
    }
}

package models;

public class Plane extends Vehicle{

    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Plane(String model, int speed, int numberOfSeats) {
        super(model, speed);
        this.setNumberOfSeats(numberOfSeats);
    }

    @Override
    public String opis()
    {
        System.out.println("Model: "+ this.getModel() +" Prędkość: "+ this.getSpeed()+" Ilość miejsc: "+this.numberOfSeats);
        return "";
    }
}

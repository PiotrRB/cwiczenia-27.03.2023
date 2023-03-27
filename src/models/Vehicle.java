package models;

public abstract class Vehicle {
    private int speed;
    private String model;

    public Vehicle(String model, int speed)
    {
        this.setModel(model);
        this.setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Object opis()
    {
        System.out.println("Model: "+ this.getModel() +"Prędkość: "+ this.getSpeed());
        return null;
    }
}

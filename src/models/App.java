package models;

public class App {
    public static void main(String[] args)
    {
        Car samochod1 = new Car("BMW", 200, 5);
        Car samochod2 = new Car("Mercedes", 190, 5);
        Plane samolot1 = new Plane("Boeing 307", 1000, 70);
        Plane samolot2 = new Plane("Boeing 150", 650, 60);
        String[] items = {String.valueOf(samochod1.opis()),String.valueOf(samochod2.opis()),String.valueOf(samolot1.opis()),String.valueOf(samolot2.opis())};

        for(int i = 0; i < items.length; i++)
        {
            System.out.println(items[i]);
        }
    }
}
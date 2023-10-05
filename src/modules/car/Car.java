package modules.car;

import modules.vehicle.Vehicle;

public class Car extends Vehicle {

    private int seats;

    public Car(String color, String year, double engine,  int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        configureCar();
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void configureCar(){
        System.out.println("Criando um carro: " + getColor() + " ano: " + "cor: " + getYear() + " motor: " + getEngine() + ", " + seats + " assentos");
        starVehicle();
    }

    @Override
    public void speedVehicle() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Parando o carro");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("Freiando o carro");
    }

}

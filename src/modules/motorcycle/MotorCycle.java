package modules.motorcycle;

import modules.vehicle.Vehicle;

public class MotorCycle extends Vehicle {
    public MotorCycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        configureMotorCycle();
    }

    public void configureMotorCycle(){
        System.out.println("Criando um moto: " + getColor() + " " + getYear());
        starVehicle();
    }

    @Override
    public void speedVehicle() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Parando a moto");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("Freiando a moto");
    }
}

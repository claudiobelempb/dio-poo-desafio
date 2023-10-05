package modules.vehicle;

public abstract class Vehicle {
    protected String color;
    protected String year;
    protected double engine;

    public void starVehicle(){
        System.out.println("Ligando os motores.");
    };
    protected abstract void speedVehicle();
    protected abstract void stopVehicle();
    protected abstract void brakeVehicle();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}

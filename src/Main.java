import modules.car.Car;
import modules.motorcycle.MotorCycle;
import modules.utils.enums.TypeVehicle;

public class Main {

    public static void main(String[] args) {
        TypeVehicle typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Amarelo", "2021", 2.5, 4);
            car.configureCar();
            car.speedVehicle();
            car.brakeVehicle();
            car.brakeVehicle();
            car.stopVehicle();
        }else if (typeVehicle == TypeVehicle.MOTORCYCLE){
            MotorCycle motorCycle = new MotorCycle("Vermelha", "2023", 2.5);
            motorCycle.configureMotorCycle();
            motorCycle.speedVehicle();
            motorCycle.brakeVehicle();
            motorCycle.brakeVehicle();
            motorCycle.stopVehicle();
        }
    }
}
package src.car;
import java.time.Instant;

public class Car {
    public String carNumber;
    String driverName;
    Instant parkingTime;

    public Car(String carNumber, String driverName) {
        this.carNumber = carNumber;
        this.driverName = driverName;
        this.parkingTime = Instant.now();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", parkingTime=" + parkingTime +
                '}';
    }
}

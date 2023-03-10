package dz;

public interface ServiceStationInterface {
    void printServiceStation(Transport[] transports);

    void checkTruck(Truck truck);

    void checkBicycle(Bicycle bicycle);

    void checkCar(Car car);
}

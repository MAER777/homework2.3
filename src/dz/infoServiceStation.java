package dz;

public interface infoServiceStation {
    void printServiceStation(Transport[] transports);

    void printServiceStation(Bicycle[] bicycles);

    void printServiceStation(Car[] cars);

    void printServiceStation(Truck[] trucks);

    void checkTruck(Truck truck);

    void checkBicycle(Bicycle bicycle);

    void checkCar(Car car);
}

package dz;

public class ServiceStationIntClient implements ServiceStationInterface {
    @Override
    public void printServiceStation(Transport[] transports) {
        System.out.println("Всего транспорта у нас: " + transports.length);
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println("Модель транспорта: " + transport.getModelName()
                    + ". Количество колес: " + transport.getWheelsCount());
        }
        System.out.println();
    }

    @Override
    public void checkTruck(Truck truck) {
        System.out.println(truck);
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }

    @Override
    public void checkBicycle(Bicycle bicycle) {
        System.out.println(bicycle);
        bicycle.updateTyre();
    }

    @Override
    public void checkCar(Car car) {
        System.out.println(car);
        car.updateTyre();
        car.checkEngine();
    }
}

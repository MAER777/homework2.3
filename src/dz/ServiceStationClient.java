package dz;

public class ServiceStationClient implements infoServiceStation {
    @Override
    public void printServiceStation(Transport[] transports) {
        System.out.println("Всего транспорта данного вида для клиента: " + transports.length);
        printTransport(transports);
        System.out.println();
    }

    @Override
    public void printServiceStation(Bicycle[] bicycles) {
        System.out.println("Всего транспорта данного вида для клиента: " + bicycles.length);
        printTransport(bicycles);
        System.out.println();
    }

    @Override
    public void printServiceStation(Car[] cars) {
        System.out.println("Всего транспорта данного вида для клиента: " + cars.length);
        printTransport(cars);
        System.out.println();
    }

    @Override
    public void printServiceStation(Truck[] trucks) {
        System.out.println("Всего транспорта данного вида для клиента: " + trucks.length);
        printTransport(trucks);
        System.out.println();
    }

    public void printTransport(Transport[] transports) {
        for (Transport transport : transports) {
            System.out.println("Модель транспорта: " + transport.getModelName()
                    + ". Количество колес: " + transport.getWheelsCount());
        }
    }

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

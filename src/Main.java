import dz.*;

public class Main {
    public static void main(String[] args) {

        Bicycle [] bicycles = {
                new Bicycle("БМХ", 2),
                new Bicycle("Стелс", 2),
                new Bicycle("Детский-Стелс", 4),
        };

        Car [] cars = {
                new Car("БМВ Е31", 4),
                new Car("Мерседес ЦЛК", 4),
                new Car("Тайота Пассо", 4),
        };

        Truck [] trucks = {
                new Truck("Интернационал 9800", 10),
                new Truck("Вольво ВНР1", 12),
        };

        bicycles[2].updateTyre();
        cars[2].checkEngine();
        cars[2].updateTyre();
        trucks[1].checkTrailer();
        trucks[1].checkEngine();
        trucks[1].updateTyre();

        ServiceStationInterface serviceStation = new ServiceStation();
        ServiceStationInterface clientServiceStation = new ServiceStationIntClient();

        Transport [] transports = new Transport[bicycles.length + cars.length + trucks.length];
        for (int i = 0; i < trucks.length; i++) {
            transports[i] = trucks[i];
        }
        for (int i = 0; i < cars.length; i++) {
            transports[i + trucks.length] = cars[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + trucks.length + cars.length] = bicycles[i];
        }

        ll();
        serviceStation.printServiceStation(transports);
        serviceStation.printServiceStation(cars);

        serviceStation.checkBicycle(bicycles[1]);
        ll();
        serviceStation.checkCar(cars[1]);
        ll();
        serviceStation.checkTruck(trucks[1]);

        System.out.println("cars[2] = " + cars[2]);
        ll();
        clientServiceStation.checkBicycle(bicycles[1]);
        ll();
        printServiceStationClient(serviceStation, bicycles, cars, trucks,transports);
        ll();
        printServiceStationClient(clientServiceStation, bicycles, cars, trucks,transports);
    }

    private static void printServiceStationClient(ServiceStationInterface printService, Bicycle[] bicycles, Car[] cars, Truck[] trucks, Transport[] transports) {
        printService.printServiceStation(bicycles);
        printService.printServiceStation(cars);
        printService.printServiceStation(trucks);
        printService.printServiceStation(transports);
    }

    private static void ll () {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
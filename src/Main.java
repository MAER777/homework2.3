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
                new Truck("Вольво ВНР", 12),
        };


        infoServiceStation serviceStation = new ServiceStation();
        infoServiceStation printServiceStationClient = new ServiceStationClient();

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

        serviceStation.printServiceStation(transports);
        trucks[1].setWheelsCount(10);
        serviceStation.printServiceStation(transports);

        serviceStation.checkTruck(trucks[1]);
        System.out.println();

        serviceStation.checkCar(cars[2]);
        System.out.println();

        serviceStation.checkBicycle(bicycles[2]);
        System.out.println();

        serviceStation.printServiceStation(cars);
        printServiceStationClient.printServiceStation(cars);

        System.out.println("222222222");
        printServiceStationClient(printServiceStationClient, bicycles, cars, trucks,transports);


//        Bicycle bmx = new Bicycle("БМХ", 2);
//        Bicycle stealth = new Bicycle("Стелс", 2);
//        Bicycle kidStealth = new Bicycle("Детский-Стелс", 4);
//
//        Car bmwE31 = new Car("БМВ Е31", 4);
//        Car mercedesCLK = new Car("Мерседес ЦЛК", 4);
//        Car toyotaPasso = new Car("Тайота Пассо", 4);
//
//        Truck international9800 = new Truck("Интернационал 9800", 10);
//        Truck volvoVNR = new Truck("Вольво ВНР", 12);

//        System.out.println(bmx);
//        bmx.updateTyre();
//        System.out.println();
//
//        System.out.println(bmwE31);
//        bmwE31.updateTyre();
//        bmwE31.checkEngine();
//        System.out.println();
//
//        System.out.println(volvoVNR);
//        volvoVNR.updateTyre();
//        volvoVNR.checkEngine();
//        volvoVNR.checkTrailer();
//        volvoVNR.setWheelsCount(10);
//        System.out.println(volvoVNR);
//        System.out.println();
//
//        ServiceStation station = new ServiceStation();
//        station.check(stealth);
//        station.check(bmwE31);
//        station.check(volvoVNR);
    }

    private static void printServiceStationClient(infoServiceStation printService, Bicycle[] bicycles, Car[] cars, Truck[] trucks, Transport[] transports) {
        printService.printServiceStation(bicycles);
        printService.printServiceStation(cars);
        printService.printServiceStation(trucks);
        printService.printServiceStation(transports);
    }
}
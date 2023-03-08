package dz;

public class ServiceStation implements infoServiceStation {

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
    public void printServiceStation(Bicycle[] bicycles) {
        System.out.println("Всего транспорта данного вида: " + bicycles.length);
        for (int i = 0; i < bicycles.length; i++) {
            Transport transport = bicycles[i];
            System.out.println("Модель транспорта: " + transport.getModelName()
                    + ". Количество колес: " + transport.getWheelsCount());
        }
        System.out.println();
    }

    @Override
    public void printServiceStation(Car[] cars) {
        System.out.println("Всего транспорта данного вида: " + cars.length);
        for (int i = 0; i < cars.length; i++) {
            Transport transport = cars[i];
            System.out.println("Модель транспорта: " + transport.getModelName()
                    + ". Количество колес: " + transport.getWheelsCount());
        }
        System.out.println();
    }

    @Override
    public void printServiceStation(Truck[] trucks) {
        System.out.println("Всего транспорта данного вида: " + trucks.length);
        for (int i = 0; i < trucks.length; i++) {
            Transport transport = trucks[i];
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
//    public void check (Transport transport) {
//        if (transport.getWheelsCount() < 4) {
//            transport.updateTyre();
//        } else if (transport.getWheelsCount() == 4) {
//            transport.updateTyre();
//            transport.checkEngine();
//        } else if (transport.getWheelsCount() > 6) {
//            transport.updateTyre();
//            transport.checkEngine();
//            transport.checkTrailer();
//        }
//    }



//    public void check(Car car, Bicycle bicycle, Truck truck) {
//        if (car != null) {
//            System.out.println("Обслуживаем " + car.modelName);
//            for (int i = 0; i < car.wheelsCount; i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.modelName);
//            for (int i = 0; i < truck.wheelsCount; i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.modelName);
//            for (int i = 0; i < bicycle.wheelsCount; i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }
}

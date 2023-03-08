package dz;

public class ServiceStation {
    public void check (Transport transport) {
        if (transport.getWheelsCount() < 4) {
            transport.updateTyre();
        } else if (transport.getWheelsCount() == 4) {
            transport.updateTyre();
            transport.checkEngine();
        } else if (transport.getWheelsCount() > 6) {
            transport.updateTyre();
            transport.checkEngine();
            transport.checkTrailer();
        }
    }



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

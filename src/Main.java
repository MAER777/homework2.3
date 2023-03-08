import dz.Bicycle;
import dz.Car;
import dz.ServiceStation;
import dz.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bmx = new Bicycle("БМХ", 2);
        Bicycle stealth = new Bicycle("Стелс", 2);
        Bicycle kidStealth = new Bicycle("Детский-Стелс", 4);

        Car bmwE31 = new Car("БМВ Е31", 4);
        Car mercedesCLK = new Car("Мерседес ЦЛК", 4);
        Car toyotaPasso = new Car("Тайота Пассо", 4);

        Truck international9800 = new Truck("Интернационал 9800", 10);
        Truck volvoVNR = new Truck("Вольво ВНР", 12);

        System.out.println(bmx);
        bmx.updateTyre();
        System.out.println();

        System.out.println(bmwE31);
        bmwE31.updateTyre();
        bmwE31.checkEngine();
        System.out.println();

        System.out.println(volvoVNR);
        volvoVNR.updateTyre();
        volvoVNR.checkEngine();
        volvoVNR.checkTrailer();
        volvoVNR.setWheelsCount(10);
        System.out.println(volvoVNR);
        System.out.println();

        ServiceStation station = new ServiceStation();
        station.check(stealth);
        station.check(bmwE31);
        station.check(volvoVNR);
    }
}
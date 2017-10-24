package lesson8.task3;

import lesson7.task4.com.company.detalis.Engine;
import lesson7.task4.com.company.professions.Driver;
import lesson8.task3.lorry.Lorry;
import lesson8.task3.sportcar.SportCar;

public class DemoCar2 {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Renault", "MAGNUM", 19000, 30000);
        SportCar sportCar = new SportCar("Chevrolet Corvette", "Stingray", 1539, 301);
        Driver driver1 = new Driver("Фаат Андрей Петрович", 35, 25);
        Engine engine1 = new Engine(480, "DXi 12");
        Driver driver2 = new Driver("Фернандо Алонсо", 28, 10);
        Engine engine2 = new Engine(301, "W821");
        lorry.setD(driver1);
        lorry.setE(engine1);
        sportCar.setD(driver2);
        sportCar.setE(engine2);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
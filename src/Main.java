// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Car car = new Car("car1",4);
            Car car2 = new Car("car2",4);

            Truck truck = new Truck("truck1",6);
            Truck truck2 = new Truck("truck2",8);

            Bicycle bicycle = new Bicycle("bicycle1",2);
            Bicycle bicycle2 = new Bicycle("bicycle2",2);

            ServiceStation station = new ServiceStation();
            station.chek(car);
            station.chek(car2);
            station.chek(bicycle);
            station.chek(bicycle2);
            station.chek(truck);
            station.chek(truck2);
    }
}
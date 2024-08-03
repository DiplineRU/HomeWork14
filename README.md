RU text
> Ниже вам даны несколько блоков кода. Ваша задача — поправить код так, чтобы он учитывал изученные принципы ООП. 
Здесь нет сложного и простого уровня, вам необходимо поправить все блоки кода. Выполненное задание присылайте ссылкой на проект на GitHub.
> 

### Обязательные для выполнения блоки кода
1-й блок кода. Пример с велосипедом
public class Bicycle {

    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
2-й блок кода. Пример с машиной
public class Car {

    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
3-й блок кода. Пример с сервисной станцией
public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }
}
4-й блок кода. Пример с грузовой машиной
public class Truck {

    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
5-й блок кода. Общий пример
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
ENG text
> Below you are given several blocks of code. Your task is to use the code so that it teaches the learned principles of OOP. 
There is no complicated and simple equation here, you need to go through all the code blocks. Please send the full proposal link to the project on GitHub.
> 

### Binders for executing a block of code
The 1st block of the code. An example with
a bicycle is a public bicycle

    the public string ModelName;
    common wheel ring int;

    public void updateTyre() {
System.out.println ("Changing the postcard");
    }
}
The 2nd block of the code. The example with the car
is the public Car class {

    the public string ModelName;
    public int wheelsCount;

    public void updateTyre() {
System.out.println ("Changing the password");
    }

    public void checkEngine() {
System.out.println ("Checking the driver");
    }
}
the 3rd block of the code. Example with a service station
public class ServiceStation {
    public invalidity check (passenger car, bike-bike, truck-truck) {
if (car != null) {
System.out.println ("Servicing" + car.ModelName);
            for (int i = 0; i < car.wheelsCount; i++) {
car.updateTyre();
            }
            car.checkEngine();
        } otherwise, if (truck != null) {
System.out.println ("Servicing" + truck.ModelName);
            for(int i = 0; i < truck.Wheel; i++)
truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } otherwise, if (bike != null) {
System.out.println ("Serviced" + bike model name);
            for (int i = 0; i < bike.Wheel; i++)
bicycle.Update Tyre();
            }
        }
    }
}
The 4th block of the code. An example with
a truck is a public truck

    the public string ModelName;
    publicly available;

    public void updateTyre () {
System.out.println ("Changing the password");
    }

    public void checkEngine() {
System.out.println ("Checking the driver");
    }

    public void checkTrailer() {
System.out.println ("Checking the step");
    }
}
The 5th block of the code. A general example
is the public Main class {
    public static void main (string of[] arguments) {
Car car = new car();
Car car2 = new car();
        car.ModelName = "car1";
        car2.ModelName = "car2";
        car.Wheel = 4;
        car2.Wheel = 4;

        Truck truck = new truck();
        Truck truck2 = new truck();
        Truck model name = "Truck 1";
        truck 2.Model Name = "Truck 2";
        truck.Wheel = 6;
        truck 2.Wheel = 8;

        Bicycle = new bike();
        Bicycle bicycle2 = new bike();
        bicycle.Model name = "bicycle1";
        bicycle 2.Model name = "bicycle2";
        bicycle.Wheel = 2;
        bicycle 2.Wheel = 2;

        Service station = new service station ();
station.check(car, null, null);
        service station(car2, null, null);
        station.check(null, bike, null);
        station.check(null, bike 2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}

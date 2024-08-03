public class Truck extends Transport implements HasTyres,HasEngine,HasTruck{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика ");
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика ");
    }
@Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика ");
    }
    @Override
    public void chek(){
        chekTyres(this);
        chekEngine();
        checkTrailer();
    }
}

public class Car extends Transport implements HasTyres, HasEngine{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void chek() {
        chekTyres(this);
        checkEngine();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку y машины ");
    }

    @Override
    public void chekTyres(Transport transport) {
        super.chek(transport);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины ");
    }
}

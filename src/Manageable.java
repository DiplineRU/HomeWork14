public interface Manageable {

    void chek();

    default void chek(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.chek();
    }
}

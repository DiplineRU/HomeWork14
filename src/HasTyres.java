public interface HasTyres {

    default void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    default void chekTyres(Transport transport){
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}

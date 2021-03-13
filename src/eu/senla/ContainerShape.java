package eu.senla;

public abstract class ContainerShape implements Container {
    abstract int getQuantity();

    @Override
    public int getWaterSize() {
     //  // if (isBig)      расчет контейнера
       return 1000;
   }
}

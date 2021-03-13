package eu.senla;

public abstract class ContainerImpl implements Container{



    private int height;
    //private Object size;
    //private  int diagonal;
    private ContainerType type;
    //private boolean isBig;


    public ContainerImpl(int height, ContainerType type) {
        this.height = height;
        //this.size = size;
        this.type = type;
    }

    public int getHeight () {return height;}

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWaterSize() {
     //  // if (isBig)      расчет контейнера
       return 1000;
   }
}

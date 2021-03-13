package eu.senla;

public class ContainerCylinder extends ContainerImpl{
    public ContainerCylinder(int height, ContainerType type) {
        super(height, type);
    }

    @Override
    public int getWaterSize() {
        return 1500; // формула расчета
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BIG;
    }
}

package eu.senla;

public class ContainerCone extends ContainerImpl{
    public ContainerCone(int height, ContainerType type) {
        super(height, type);
    }

    @Override
    public int getWaterSize() {
        return 10; // формула расчета
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BIG;
    }
}

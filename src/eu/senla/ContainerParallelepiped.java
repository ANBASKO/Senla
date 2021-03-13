package eu.senla;

public class ContainerParallelepiped extends ContainerImpl{
    public ContainerParallelepiped(int height, ContainerType type) {
        super(height, type);
    }

    @Override
    public int getWaterSize() {
        return 2500;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.SMALL;
    }
}

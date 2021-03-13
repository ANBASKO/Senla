package eu.senla;

public class Main {

    // поскольку преподаватель сам не смог решить домашнее задание, выкладываю свой вариант, тоже не решенный
    public static void main(String[] args) {

        Container containerCylinder=new ContainerCylinder(10, ContainerType.BIG);
        Container containerCone=new ContainerCone(10, ContainerType.BIG);
        Container containerParallelepiped=new ContainerParallelepiped(10, ContainerType.SMALL);
       // Container smallC1=new ContainerImpl(10, ContainerType.SMALL);

        Deck deck1=new Deck(1);
        deck1.add(containerCylinder);
        deck1.add(containerCone);
        deck1.add(containerParallelepiped);

        Deck deck2=new Deck(4);
        deck2.add(containerCone);
        deck2.add(containerCylinder);
        deck2.add(containerParallelepiped);

        Deck[] decks=new Deck[] {deck1, deck2};

        Ship2 ship2=new Ship2(decks);

        int water;
        water = ship2.getWater();


    }
}

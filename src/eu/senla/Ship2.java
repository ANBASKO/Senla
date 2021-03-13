package eu.senla;

public class Ship2 implements Ship {

   // private Deck [] decks=new Deck[2];
    //@Override
    //public Deck[] getDeks() {
      //  return decks;
    //}

    private Deck [] decks;
    public Deck[] getDecks() {
        return decks;
    }

    //@Override
    //public Deck[] getDecks() {
    //    return new Deck[0];
    //}

    @Override
    public int getWater() {
        int finalWater=0;
        for (Deck deck:decks){
         finalWater+=deck.getWater();
        }

        return finalWater;
    }

    public Ship2 (Deck[] decks){

        // проверка
        this.decks=decks;
    }

}

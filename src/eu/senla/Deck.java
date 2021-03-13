package eu.senla;

public class Deck {

    private Container[] containers;


    public void add(Container container){

        if (containers==null){
          containers=new Container[4];

        }
        int leght=containers.length;
        //ContainerType type= container.getType();
        int totalSmall=0;
        int totalBig = 0;

        for (int i=0; i<leght; i++) {
            if (containers[i]!=null) {
              ContainerType currentType=  container.getType();
              if (currentType.equals(ContainerType.BIG)) {
                  totalBig++;
              } else { totalSmall++;}
            }

        }


       // if (leght<1){
       //    containers[0]=container;
       // }




        // палуба свободна?
        //разместить 2 двух или 4 одно контейнеров
    }

    public Deck(int containersSize){
        this.containers=new  Container[containersSize];
    }


    public int getWater(){
        int size=0;
        for (Container c: containers){
        size+=c.getWaterSize();}
        return size;
    }



    public Container[] getContainers() {
        return containers;
    }

}

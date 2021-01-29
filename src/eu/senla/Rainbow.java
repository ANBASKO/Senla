package eu.senla;

public class Rainbow {

    static int a;

    //String radugaString;

    public static void setA(int a) {
        Rainbow.a = a;
    }

    public static int getA() {
        return a;
    }


    public void switcher() {
        switch (a) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            case 8:
                System.out.println("Красно-оранжевый");
                break;
            case 9:
                System.out.println("Оранжево-желтый");
                break;
            case 10:
                System.out.println("Желто-зеленый");
                break;
            case 11:
                System.out.println("Зелено-голубой");
                break;
            case 12:
                System.out.println("Голубо-синий");
                break;
            case 13:
                System.out.println("Сине-фиолетовый");
                break;
        }

    }

   /* public void setRadugaString(String radugaString) {
        this.radugaString = radugaString;
    }

    public String getRadugaString() {
        return radugaString;
    } */
}

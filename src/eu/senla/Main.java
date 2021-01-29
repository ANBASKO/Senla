package eu.senla;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите номер цвета радуги от 1 до 7 или полутонов от 8 до 13");
        System.out.println("Необходимо вводить целое положительное число");
        System.out.print("Водите номер: ");
        int num = in.nextInt();

        if ( num>=1&num<=7 ) {

            Rainbow ourClass = new Rainbow();
            ourClass.setA((int) num);
            System.out.printf("Вы выбрали цвет: ");
            ourClass.switcher();

        }
        else
        if ( num>=8&num<=13 ) {

            Rainbow ourClass = new Rainbow();
            ourClass.setA((int) num);
            System.out.printf("Вы выбрали полутон: ");
            ourClass.switcher();
        }
        else
            System.out.println("Необходимо вводить целое положительное число в диапазоне от 1 до 13");;

        System.out.printf("Вы ввели номер: %d \n", num);
        in.close();

    }
}

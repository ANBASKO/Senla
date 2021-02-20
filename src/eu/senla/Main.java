package eu.senla;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        String[][] array = new String[10][10];

        String[] resultat = new String[10];
        String[] resultatobr = new String[10];

        Double[] doubleArray = new Double[(10+10)]; // это максимум элементов для 2-х диагоналей
        int count=0;

        StringBuilder stringBuilder= new StringBuilder();

        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (counter++ % 3 == 0) {
                    array[i][j] = Double.toString(Math.random()).substring(0,6);
                } else {

                    String s = "";
                    char[] array1 = new char[6];
                    int rand;
                    Random r = new Random();
                    for (int a = 0; a < 6; a++) {
                        rand = r.nextInt(25) + 65; //задается диапазон символов ((max - min) + 1) + min (см ASCII)
                        array1[a] = (char) rand;
                        s = s + array1[a];
                    }
                    array[i][j] = s;

                    // Собираем обратную диагональ
                } if (j==9-i) {
                    resultatobr[i] = array[i][j];
                    if (isNumber(resultatobr[i])){
                        Double value = Double.parseDouble(resultatobr[i]);
                        if (value>=1.7){
                            value=Math.ceil(value);
                        }
                        else {
                            value=Math.floor(value);
                        }
                        doubleArray[count++]=value;

                    }
                    else {
                        stringBuilder.append(resultatobr[i].substring(1,4));
                        stringBuilder.append(", ");
                    }
                }
                else {
                    // Собираем прямую диагональ
                    if (i == j) {
                    resultat[i] = array[i][j];
                        if (isNumber(resultat[i])){
                            Double value = Double.parseDouble(resultat[i]);
                            if (value>=1.7){
                                value=Math.ceil(value);
                            }
                            else {
                                value=Math.floor(value);
                            }
                            doubleArray[count++]=value;

                        }
                        else {
                            stringBuilder.append(resultat[i].substring(1, 4));
                            stringBuilder.append(", ");
                        }
                }

            }

                //System.out.println(Arrays.equals(resultat, resultatobr));
                    System.out.print(array[i][j]+" ");
            }
            System.out.println("");

        }
        //System.out.println("Диагонали равны = "+ Arrays.equals(resultat, resultatobr));
        System.out.println("Строка= "+stringBuilder.toString());
        System.out.print("Массив диагоналей: ");
        for (Double element: doubleArray) {
            System.out.print(element+"_");
        }


    }

public static boolean isNumber(String value) {
    String sumbols = "0123456789";
    for (char ch : value.replace(".", "").toCharArray()) {
        if (!Character.isDigit(ch)) {
            return false;
        }
    }
    return true;
}


}






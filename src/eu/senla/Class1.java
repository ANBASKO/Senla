package eu.senla;

public class Class1 {
    public static byte a1;
    public static short b1;
    public static int c1;
    public static long d1;
    public static float e1;
    public static double i1;
    public static char f1;
    public static boolean g1;

    public static Byte a2;
    public static Short b2;
    public static Integer c2;
    public static Long d2;
    public static Float e2;
    public static Double i2;
    public static Character f2;
    public static Boolean g2;

    public static void main(String[] args) {
        byte a3;
        short b3;
        int c3;
        long d3;
        float e3;
        double i3;
        char f3;
        boolean g3;

        Byte a4;
        Short b4;
        Integer c4;
        Long d4;
        Float e4;
        Double i4;
        Character f4;
        Boolean g4;

        Class2 ourClass2 = new Class2();
        ourClass2.setA((byte) 115);
        a1=a2=a3=a4=ourClass2.getA();

        System.out.printf("а1=%s%n",a1);
        System.out.printf("а2=%s%n",a2);
        System.out.printf("а3=%s%n",a3);
        System.out.printf("а4=%s%n",a4);
        //все аналогично для short, int, long


        ourClass2.setE((float) 115.314);
        e1=e2=e3=e4=ourClass2.getE();

        System.out.printf("e1=%s%n",e1);
        System.out.printf("e2=%s%n",e2);
        System.out.printf("e3=%s%n",e3);
        System.out.printf("e4=%s%n",e4);
        //все аналогично для double

        ourClass2.setG((boolean) true);
        g1=g2=g3=g4=ourClass2.isG();

        System.out.printf("g1=%s%n",g1);
        System.out.printf("g2=%s%n",g2);
        System.out.printf("g3=%s%n",g3);
        System.out.printf("g4=%s%n",g4);

        ourClass2.setF((char) 655);
        f1=f2=f3=f4=ourClass2.getF();

        System.out.printf("f1=%s%n",f1);
        System.out.printf("f2=%s%n",f2);
        System.out.printf("f3=%s%n",f3);
        System.out.printf("f4=%s%n",f4);

        //приведение типов

        System.out.println("Приведение типов");

        d1=c1=b1=b4=(short)a1;
       System.out.printf("b1=%s%n",b1);
       System.out.printf("b4=%s%n",b4);
        System.out.printf("c1=%s%n",c1);
        System.out.printf("d1=%s%n",d1);

        c1=c4=(int)a1;
        System.out.printf("c1=%s%n",c1);
        System.out.printf("c4=%s%n",c4);

        i1=e4;
        System.out.printf("i1=%s%n",i1);
        System.out.printf("e4=%s%n",e4);

        //все остальное по аналогии
        //надеюсь задание будет зачтено
    }

}



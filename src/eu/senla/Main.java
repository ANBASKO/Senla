package eu.senla;

public class Main {

    public static void main(String [] args) {

        int i=1;

        System.out.println("Первый цикл: ");

        while(i++<11) {

            Cat cat = new Cat();
            System.out.println(cat.getName()+" "+cat.getAge());
        }


        System.out.println("Второй цикл: ");


        for (int j=1; j<11; j++) {

            Cat cat = new Cat();
            String s = "Котяра";
            String b = Integer.toString(j);
            s = s.concat(b);

            cat.setName(s);
            cat.setAge(j+2);

            System.out.println(cat.getName()+" Возраст: "+cat.getAge());
        }

        System.out.println("Третий цикл: ");

        do {

            String s = "Котяра";
            String b = Integer.toString(i);
            s = s.concat(b);
            Cat cat = new Cat();
            cat.setCat(s,i);

        } while (i-->3);

        System.out.println("Четвертый цикл: ");

        Cat[] cats = new Cat[5];//{new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        i=0;
        while (i<5) {

            Cat cat=new Cat();
            String s = "Кот";
            String b = Integer.toString(i);
            s = s.concat(b);

            cat.setName(s);
            cat.setAge(i);
            cats [i]= cat;
            i++;
        }

        for (Cat cat: cats) {

            System.out.println(cat.getName()+" Возраст: "+cat.getAge());
            //System.out.println(cat.toString());
        }


        }


    }




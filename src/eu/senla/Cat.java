package eu.senla;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private int Age=1;
    private String Name="Барсик";

    public void setCat(String name, int age) {

        setName(name);
        setAge(age);
        System.out.println(getName()+" Возраст: "+getAge());
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getAge() == cat.getAge() && getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}

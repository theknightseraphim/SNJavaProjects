/*
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    /*public boolean fight(Cat anotherCat) {
        return fight();
    }*/

    public static void main(String[] args) {
        Cat Tigrulya = new Cat();
        Tigrulya.age = 2;
        Tigrulya.weight = 5;
        Tigrulya.strength = 6;

        Cat Murzik = new Cat();
        Murzik.age = 5;
        Murzik.weight = 3;
        Murzik.strength = 5;
    }
}
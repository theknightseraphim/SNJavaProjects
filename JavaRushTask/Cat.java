package MyCodes;

public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", 5);
        System.out.println(barsik.name);
        System.out.println(barsik.age);
    }
}

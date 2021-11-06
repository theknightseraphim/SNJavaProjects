package LVL5;
/*
Кошачья бойня2
*/
public class CatFight2 {

    public static void main(String[] args) {
        Cat tigrulya = new Cat("Tigrulyanator!", 2, 5, 6);
        Cat barsik = new Cat("SnowBars!", 6, 4, 5);
        Cat murzik = new Cat("MurKill!", 4, 3, 5);

        System.out.println("Кот " + (tigrulya.fight(barsik) ? 1 : 2) + " победил");
        System.out.println("Кот " + (tigrulya.fight(murzik) ? 1 : 3) + " победил");
        System.out.println("Кот " + (barsik.fight(murzik) ? 2 : 3) + " победил");
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
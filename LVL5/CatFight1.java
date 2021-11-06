package LVL5;

public class CatFight1 {
    public int age;
    public int weight;
    public int strength;

    public CatFight1() {
    }

    public boolean fight(CatFight1 anotherCat) {
        int countTigrulya = 0;
        int countBarsik = 0;

        if (this.age >= anotherCat.age){
            countTigrulya++;
        }
        else countBarsik++;

        if (this.weight >= anotherCat.weight){
            countTigrulya++;
        }
        else countBarsik++;

        if (this.strength >= anotherCat.strength){
            countTigrulya++;
        }
        else countBarsik++;

        if (countTigrulya > countBarsik){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        CatFight1 tigrulya = new CatFight1();
        tigrulya.age = 2;
        tigrulya.weight = 5;
        tigrulya.strength = 6;

        CatFight1 barsik = new CatFight1();
        barsik.age = 6;
        barsik.weight = 4;
        barsik.strength = 4;

        tigrulya.fight(barsik);
        barsik.fight(tigrulya);

        System.out.println("Кот " + (tigrulya.fight(barsik) ? 1 : 2) + " победил");
    }
}
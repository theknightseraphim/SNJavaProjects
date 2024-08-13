package LVL6;
import static java.lang.Math.sqrt;
/*
Расстояние между двумя точками
*/
public class Lvl6Lesson8_Rasstoyanie {
    public static double getDistance(int x1, int y1, int x2, int y2){
        double rasst = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return rasst;
    }

    public static void main(String[] args) {
        Lvl6Lesson8_Rasstoyanie.getDistance(4, 4, 4, 4);
    }
}

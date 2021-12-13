package SNJavaProjects.LVL7;
import java.util.ArrayList;

/*
Продолжаем мыть раму
*/
public class ArrayMamaMilaRamu {
    public static void main(String[] args) {
        String[] arraySlov = {"мама", "мыла", "раму"};
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < arraySlov.length; i++) list.add(arraySlov[i]);
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
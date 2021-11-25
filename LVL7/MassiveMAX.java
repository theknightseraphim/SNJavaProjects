package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Массивный максимум
*/
public class MassiveMAX {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        //вывод на экран результата
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        //заполнение массива числами с консоли
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        // находим максимальное значение
        int max = array[0];
        for (int i = 0; i < 20; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
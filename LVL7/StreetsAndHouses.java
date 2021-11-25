package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Улицы и дома
*/
public class StreetsAndHouses {
    static int[] array = new int[15];
    static int sumchet = 0;
    static int sumnechet = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //заполнение массива числами с консоли
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        //подсчёт чет нечет чисел
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sumchet += array[i];
            }
            else {
                sumnechet += array[i];
            }
        }
        //вывод на экран результаты
        if (sumchet > sumnechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (sumnechet > sumchet){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Один большой массив и два маленьких
*/
public class OneBigMassiveAndTwoSmalls {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] small_1_Array = new int[10];
        int[] small_2_Array = new int[10];

        //заполнение большого массива числами с консоли
        for (int i = 0; i < bigArray.length; i++){
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        //заполнение маленького 1 массива числами с консоли
        for (int i = 0; i < small_1_Array.length; i++){
            small_1_Array[i] = bigArray[i];
        }
        //заполнение маленького 2 массива числами с консоли
        for (int i = 0; i < small_2_Array.length; i++){
            small_2_Array[i] = bigArray[i+10];
        }
        //вывод на экран маленького 2 массива
        for (int i = 0; i < small_2_Array.length; i++){
            System.out.println(small_2_Array[i]);
        }
    }
}
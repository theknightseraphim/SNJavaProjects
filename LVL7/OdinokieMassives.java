package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Общение одиноких массивов
*/
public class OdinokieMassives {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayOfStrings = new String[10];
        int[] arrayOfNumbers = new int[10];

        //заполнение массива строк строками из консоли
        for (int i = 0; i < arrayOfStrings.length; i++){
            arrayOfStrings[i] = reader.readLine();
        }
        //заполнение массива чисел длинами строк массива строк
        for (int i = 0; i < arrayOfNumbers.length; i++){
            arrayOfNumbers[i] = arrayOfStrings[i].length();
        }
        //вывод на экран
        for (int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println(arrayOfNumbers[i]);
        }
    }
}
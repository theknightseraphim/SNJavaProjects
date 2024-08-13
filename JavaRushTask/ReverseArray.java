package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
Массив из строчек в обратном порядке
*/
public class ReverseArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];

        //заполнение массива числами с консоли
        for (int i = 0; i < 8; i++){
            array[i] = reader.readLine();
        }
        //вывод на экран
        for (int i = 9; i > -1; i--){
            System.out.println(array[i]);
        }
    }
}
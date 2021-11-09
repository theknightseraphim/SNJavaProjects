package SNJavaProjects.LVL7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
*/
public class Hard_ChislaPoVozrastaniyu {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];

        //заполнение массива числами с консоли
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        //сортировка по возрастанию
        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list [j - 1]) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
        /*for (int i = 1; i < list.length; i++){
            if (list[i] < list[i] - 1){
                swap(list, i, i - 1);
            }
            else {
                break;
            }
        }*/
        //вывод на экран
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
    /*//метод перестановки двух чисел
    private static void swap(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }*/
}
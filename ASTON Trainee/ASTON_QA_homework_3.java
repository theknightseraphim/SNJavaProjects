package SNJavaProjects.TestirovaniePO_Tasks.TestirovaniePO_Tasks;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы
массива кратные 3
*/
public class ASTON_QA_homework_3 {
    public static void main(String[] args) {
        int[] array = initializeArray();
        ArrayList<Integer> array2 = divThree(array);
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array)); //вывод введенного массива на экран
        System.out.println("Изменённый массив:");
        System.out.println(array2); //вывод изменённого массива на экран
    }

    public static int[] initializeArray() { //метод заполнения массива числами с консоли
        System.out.println("Задайте длину массива:");
        //задание размерности массива числом с консоли
        Scanner scan = new Scanner(System.in);
        int[] massive = new int[scan.nextInt()];

        System.out.println("Заполните массив числами:");
        //заполнение массива числами с консоли
        for (int i = 0; i < massive.length; i++) {
            massive[i] = scan.nextInt();
        }
        return massive;
    }

    public static ArrayList<Integer> divThree(int[] array2){ //метод удаления всех чисел кратных 3
        ArrayList<Integer> copyMassive = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            if (Math.abs(array2[i]%3) > 0 || array2[i] == 0){
                copyMassive.add(array2[i]);
            }
        }
        return copyMassive;
    }
}
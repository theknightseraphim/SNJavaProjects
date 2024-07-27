package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n.
Напишите код, который создаст массив с именем array на n элементов,
где буду храниться числа от 0 до n - 1 (элемент равен квадрату индекса).*/

public class Arrays11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.pow(i, 2);
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
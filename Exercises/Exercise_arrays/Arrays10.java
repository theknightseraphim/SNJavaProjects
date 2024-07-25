package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n.
Напишите код, который создаст массив с именем array на n элементов,
где буду храниться числа от 0 до n - 1 (элемент равен индексу).*/

public class Arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[sc.nextInt()];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
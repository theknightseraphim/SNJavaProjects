package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов,
где будут храниться введённые числа
(элемент массива равен соответствующему числу во второй строке).*/

public class Arrays12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            int m = sc.nextInt();
            array[i] = m;
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
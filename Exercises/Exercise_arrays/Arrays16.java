package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Выведите на экран n - 1 число:
сумму первого элемента и второго, затем сумму второго и третьего, третьего и четвёртого и т.д.*/

public class Arrays16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        for (int i = 0; i < array.length-1; i++){
            array[i] += array[i+1];
            System.out.print(array[i] + " ");
        }
        scan.close();
    }
}
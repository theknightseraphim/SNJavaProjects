package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов.
Затем вводится число k. Найдите количество элементов в массиве равных k.*/

public class Arrays19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        int number = scan.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
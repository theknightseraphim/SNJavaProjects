package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n (n > 1). На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов.
Найдите количество элементов, которые больше предыдущего элемента.*/

public class Arrays17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        int count = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] > array[i]){
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
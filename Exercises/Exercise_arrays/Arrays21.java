package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. На следующей строке вводятся два индекса:
l и r. Найдите среднее арифметическое всех элементов с индексами от l до r включительно.
Выведите в ответ одно действительное число. Гарантируется, что 0 <= l <= r < n.*/

public class Arrays21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double sum = 0;
        double quant = 0;
        for (int i = 0; i < array.length; i++){
            if (i < num1 || i > num2){
                continue;
            }
            else if (i >= num1 && i <= num2){
                sum +=(double) array[i];
                quant++;
            }
        }
        System.out.print(sum/quant);
        scan.close();
    }
}
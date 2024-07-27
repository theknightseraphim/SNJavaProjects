package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k.
Найдите сумму первых k элементов. Гарантируется, что 0 < k <= n.*/

public class Arrays20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        int number = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (i < number){
                sum += array[i];
            }
        }
        System.out.print(sum);
        scan.close();
    }
}
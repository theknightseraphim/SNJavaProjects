package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Считайте их как массив на n элементов. Затем вводится число k. Найдите индекс элемента k.
Если такого элемента нет в массиве, выведите на экран слово Error.*/

public class Arrays18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){   //заполнение массива числами из консоли
            int nums = scan.nextInt();
            array[i] = nums;
        }

        int number = scan.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                System.out.print(i);
                flag = true;
            }
        }
        if (flag == false) System.out.print("Error");
        scan.close();
    }
}
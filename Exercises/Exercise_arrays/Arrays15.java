package Exercise_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
Напишите код, который создаст массив с именем array на n элементов,
где будут храниться введённые числа
(элемент массива равен соответствующему числу во второй строке).
На следующей строке вводится число t - Количество запросов к вашей программе.
Каждый запрос состоит из пары целых чисел и записывается на отдельной строке.
Каждая пара чисел - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов для каждого запроса на каждой строке по отдельности.
Если вдруг индекс оказался вне пределов диапазона от 0 до n - 1,
то выведите на экран слово Error.*/

public class Arrays15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];               //создание массива с размером числа из консоли

        for (int i = 0; i < array.length; i++){ //заполнение массива числами из консоли
            int m = sc.nextInt();
            array[i] = m;
        }

        int t = sc.nextInt();
        for (int k = 0; k < t; k++){
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < array.length; i++){
                if (i == num3) sum += array[i];
                if (i == num4) sum += array[i];
            }

            if ((num3 < 0 || num3 > array.length-1) || (num4 < 0 || num4 > array.length-1)){
                System.out.println("Error");
            }
            else System.out.println(sum);
        }
        sc.close();
    }
}
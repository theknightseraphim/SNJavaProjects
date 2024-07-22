package Exercise_arrays;
import java.util.Scanner;

/*Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её.
А потом выведите числа, которые суммировались.*/

class Arrays4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод кол-ва чисел
        int[] arr = new int[kolArr];
        int sum = 0;

        for (int i=0; i<kolArr; i++){        //сумма введенных чисел
            int numsArr = scan.nextInt();
            arr[i] = numsArr;
            if (i%2 == 0) sum += arr[i];
        }
        System.out.println(sum);

        for (int i=0; i<kolArr; i++){
            if (i%2 == 0) System.out.println(arr[i]);
        }
        scan.close();
    }
}
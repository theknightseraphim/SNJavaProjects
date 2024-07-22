package Exercise_arrays;
import java.util.Scanner;

/*Вводится список (сначала количество элементов, потом сами элементы).
Найдите сумму всех элементов и выведите её.
А потом выведите введённые числа в обратном порядке.*/

class Arrays3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод кол-ва чисел
        int[] arr = new int[kolArr];
        int sum = 0;

        for (int i=0; i<kolArr; i++){        //сумма введенных чисел
            int numsArr = scan.nextInt();
            arr[i] = numsArr;
            sum += arr[i];
        }
        System.out.println(sum);

        for (int i = kolArr-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
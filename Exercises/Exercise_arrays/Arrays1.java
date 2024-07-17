package Exercise_arrays;
import java.util.Scanner;

/*Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
Затем вводятся 2 числа из этого диапазона.
Используя данные из массива найдите их кубы.*/

class Arrays1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int count = 1001;
        int[] arr = new int[count];

        for (int i = 0; i < count; i++){
            arr[i] = (int)Math.pow(i, 3);
            if (num1 == i){
                System.out.println(arr[i]);
            }
            else if (num2 == i){
                System.out.println(arr[i]);
            }
        }
    }
}
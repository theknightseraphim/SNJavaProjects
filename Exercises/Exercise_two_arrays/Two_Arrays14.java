package Exercise_two_arrays;
import java.util.Scanner;

/*Дан массив, состоящий из целых чисел. Напишите программу, которая в данном массиве определит
количество элементов, где есть два соседних и, при этом, оба элемента меньше данного.*/

class Two_Arrays14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];                 //считываем число с консоли и создаем массив

        for (int i = 0; i < array.length; i++){     //записываем числа с консоли в массив
            int temp = scan.nextInt();
            array[i] = temp;
        }
        scan.close();

        int count = 0;
        for (int i = 2; i < array.length; i++){
            if ((array[i-1]>array[i-2])&&(array[i-1]>array[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
package Exercise_two_arrays;
import java.util.Scanner;

/*Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
Напишите программу, которая выведет чётные элементы массива.*/

class Two_Arrays12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++){
            int temp = scan.nextInt();
            array[i] = temp;
            if (array[i]%2==0) System.out.print(array[i] + " ");
        }
        scan.close();
    }
}

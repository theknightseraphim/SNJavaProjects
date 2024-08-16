package Exercise_two_arrays;
import java.util.Scanner;

/*Дан массив, состоящий из целых чисел. Напишите программу, которая отсортирует его по возрастанию.*/

class Two_Arrays15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++){
            int numbers = scan.nextInt();
            array[i] = numbers;
        }
        scan.close();

        for (int i = 0; i < array.length; i++){
            for (int k = 1; k < array.length; k++){
                int temp = 0;
                if (array[k]<array[k-1]){
                    temp = array[k-1];
                    array[k-1] = array[k];
                    array[k] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
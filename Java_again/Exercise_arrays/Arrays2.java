package Exercise_arrays;
import java.util.Scanner;

/*Вводится число n, затем n чисел целых, по одному на каждой строке.
Затем вводится число, на которое нужно умножить все введённые выше числа.
Выведите на экран результат умножения построчно.*/

class Arrays2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();
        int[] array = new int[kolArr];

        for (int i = 0; i < kolArr; i++){
            int nums = scan.nextInt();
            array[i] = nums;
        }
        int numProizv = scan.nextInt();
        for (int i = 0; i < kolArr; i++){
            array[i] *= numProizv;
            System.out.println(array[i]);
        }
    }
}
package Exercise_two_arrays;
import java.util.Scanner;

/*Вводятся 2 натуральных числа: n и m.
Выведите на экран таблицу умножения размером n*m через пробел.*/

class Two_Arrays1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int[][] array = new int[num1][num2];

        int count = 1;
        for (int i = 0; i < num1; i++){
            int temp = 1;
            for (int k = 0; k < num2; k++){
                array[i][k] = count*temp;
                temp++;
            }
            count++;
        }

        for (int i = 0; i < num1; i++){
            for (int k = 0; k < num2; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
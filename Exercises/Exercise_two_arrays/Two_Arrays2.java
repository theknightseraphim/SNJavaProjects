package Exercise_two_arrays;
import java.util.Scanner;

/*Вводятся 2 натуральных числа: n и m. Затем вводится через пробел n*m целых чисел.
Сохраните их в табличном виде и выведите на экран (разделитель - пробел).*/

class Two_Arrays2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int[][] array = new int[num1][num2]; //создание двумерного массива размерностью из консоли

        for (int i = 0; i < num1; i++){        //заполнение числами из консоли
            for (int k = 0; k < num2; k++){
                int arrNums = scan.nextInt();
                array[i][k] = arrNums;
            }
        }

        for (int i = 0; i < num1; i++){        //вывод чисел на экран
            for (int k = 0; k < num2; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
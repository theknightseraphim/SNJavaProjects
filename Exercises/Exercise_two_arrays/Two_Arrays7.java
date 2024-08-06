package Exercise_two_arrays;
import java.util.Scanner;

/*Вводятся 2 натуральных числа: n и m. Затем вводится двумерный массив размером n*m.
Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).*/

class Two_Arrays7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int columns = scan.nextInt();
        int raws = scan.nextInt();
        int[][] array = new int[columns][raws];        //создание двумерного массива размерностью из консоли

        for (int i = 0; i < columns; i++){             //заполнение массива
            for (int k = 0; k < raws; k++){
                int arrNum = scan.nextInt();
                array[i][k] = arrNum;
            }
            System.out.println();
        }
        scan.close();

        for (int i = 0; i < raws; i++){             //вывод на экран
            for (int k = columns-1; k >= 0; k--){
                System.out.print(array[k][i] + " ");
            }
            System.out.println();
        }
    }
}
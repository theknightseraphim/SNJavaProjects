package Exercise_two_arrays;
import java.util.Scanner;

/*Вводится натуральное число n. Затем вводится двумерный массив размером n*n.
Отобразите его относительно главной диагонали (из левого верхнего угла до правого нижнего)
и выведите на экран (через пробел).*/

class Two_Arrays9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int colRaws = scan.nextInt();
        int[][] array = new int[colRaws][colRaws];     //создание двумерного массива размерностью из консоли

        for (int i = 0; i < colRaws; i++){             //заполнение массива
            for (int k = 0; k < colRaws; k++){
                int arrNum = scan.nextInt();
                array[i][k] = arrNum;
            }
            System.out.println();
        }
        scan.close();

        for (int i = 0; i < colRaws; i++){             //вывод на экран
            for (int k = 0; k < colRaws; k++){
                if (i == k){
                    System.out.print(array[i][k] + " ");
                }
                else System.out.print(array[k][i] + " ");
            }
            System.out.println();
        }
    }
}
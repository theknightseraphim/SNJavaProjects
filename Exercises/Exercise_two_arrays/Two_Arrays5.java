package Exercise_two_arrays;
import java.util.Scanner;

/*Сначала вводятся два натуральных числа n и m - количество строки и столбцов в двумерном массиве.
Затем вводится сами элементы массива. Определите индексы минимального элемента этого двумерного массива.
Гарантируется, что такой элемент единственный.
Выведите в качестве ответа два целых числа через пробел.*/

class Two_Arrays5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int columns = scan.nextInt();
        int raws = scan.nextInt();
        int[][] array = new int[columns][raws]; //создание двумерного массива размерностью из консоли

        if (columns <= 0 || raws <= 0){
            System.out.println(0 + " " + 0);
            return;
        }
        else if (columns > 0 && raws > 0){
            for (int i = 0; i < columns; i++){    //заполнение массива
                for (int k = 0; k < raws; k++){
                    int arrNum = scan.nextInt();
                    array[i][k] = arrNum;
                }
                System.out.println();
            }
            scan.close();
        }

        int min = array[0][0];
        int col = 0;
        int raw = 0;
        for (int i = 0; i < columns; i++){    //проверка массива на минимальное значение и вывод на экран
            for (int k = 0; k < raws; k++){
                if (array[i][k] < min){
                    min = array[i][k];
                    col = i;
                    raw = k;
                }
            }
            System.out.println();
        }
        System.out.println(col + " " + raw);
    }
}
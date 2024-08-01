package Exercise_two_arrays;
import java.util.Scanner;

/*Главной диагональю в таблице (правильнее говорить матрице) называют диагональ,
идущую из верхнего левого угла в нижний правый.
Вводится число n. Выведите на экран матрицу размером n на n, у которой:
все элементы главной диагонали равны 1;
все элементы, которые лежат ниже главной диагонали равны 2;
все элементы, которые лежат выше главной диагонали равны 0.
Внутри строки между элементами должен находится пробел.*/

class Two_Arrays3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] array = new int[size][size]; //создание двумерного массива размерностью из консоли

        for (int i = 0; i < size; i++){        //составление диагонали
            for (int k = 0; k < size; k++){
                if (i == k){
                    array[i][k] = 1;
                }
                else if (k > i){
                    array[i][k] = 0;
                }
                else array[i][k] = 2;
            }
        }

        for (int i = 0; i < size; i++){        //вывод чисел на экран
            for (int k = 0; k < size; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
        scan.close();

        //можно было конечно сделать всё в один прогон.
    }
}
package Exercise_two_arrays;
import java.util.Scanner;

/*Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
Программа получает на вход число n < 100, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.*/

class Two_Arrays4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[][] array = new int[number][number];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < number; i++){
            for (int k = 0; k < number; k++){
                int arrNum = scan.nextInt();
                array[i][k] = arrNum;
                if(k > i){
                    sum1 += array[i][k];
                }
                else if(i > k){
                    sum2 += array[i][k];
                }
            }
            System.out.println();
        }
        if(sum1 == sum2){
            System.out.println("YES");
        }
        else System.out.println("NO");
        scan.close();
    }
}
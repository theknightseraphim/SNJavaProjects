package Exercise_two_arrays;
import java.util.Scanner;

/*Программа получает на вход число n < 11, являющееся числом строк и столбцов в массиве.
Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
Программа должна выводить слово YES для магического квадрата и слово NO для не магического.*/

// I'm done.

class Two_Arrays10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int colRaws = scan.nextInt();
        int[][] array = new int[colRaws][colRaws];     //создание двумерного массива размерностью из консоли

        if (array[0].length < 11){
            for (int i = 0; i < colRaws; i++){             //заполнение массива
                for (int k = 0; k < colRaws; k++){
                    int arrNum = scan.nextInt();
                    array[i][k] = arrNum;
                }
                System.out.println();
            }
            scan.close();
        }
        else System.out.println("Error");

        int sumCols = 0;
        int sumRaws = 0;
        int sumDiags = 0;
        for (int i = 0; i < colRaws; i++){             //вывод на экран
            int tempSumCols = 0;
            int tempSumRaws = 0;
            int tempSumDiags = 0;
            for (int k = 0; k < colRaws; k++){
                tempSumCols += array[i][k];
                tempSumRaws += array[k][i];
                if (i == k) tempSumDiags += array[i][k];
            }
            if (sumCols <= tempSumCols){
                sumCols = tempSumCols;
            }
            if (sumRaws <= tempSumRaws){
                sumRaws = tempSumRaws;
            }
            sumDiags += tempSumDiags;

            System.out.println();
            System.out.println(tempSumCols);
            System.out.println(tempSumRaws);
            System.out.println(tempSumDiags);
        }
        System.out.println();
        System.out.println(sumCols);
        System.out.println(sumRaws);
        System.out.println(sumDiags);
        System.out.println();
        if (sumCols == sumRaws && sumCols == sumDiags){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
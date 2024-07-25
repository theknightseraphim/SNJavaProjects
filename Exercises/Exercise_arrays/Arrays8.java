package Exercise_arrays;
import java.util.Scanner;

/*Переставьте соседние элементы списка (A[0] c A[1], A[2] c A[3] и т.д.).
Если элементов нечетное число, то последний элемент остается на своем месте.*/

class Arrays8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод размерности массива
        int[] arr = new int[kolArr];

        for (int i=0; i<kolArr; i++){        //заполнение массива числами
            int numsArr = scan.nextInt();
            arr[i] = numsArr;
        }

        if (kolArr%2 == 0){
            for (int i=0; i<kolArr; i+=2){        //перестановка соседних чисел, при чётном массиве
                if (i<kolArr){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        else if (kolArr%2 == 1){
            for (int i=0; i<kolArr-1; i+=2){        //перестановка соседних чисел, при нечётном массиве
                if (i<kolArr-1){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for (int i=0; i<kolArr; i++){        //вывод массива
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
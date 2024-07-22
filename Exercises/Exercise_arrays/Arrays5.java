package Exercise_arrays;
import java.util.Scanner;

/*Дан список (сначала количество элементов, потом сами элементы).
Потом водятся два числа: a и b. Поменяйте местами значения a-ого и b-ого
элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.*/

class Arrays5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод кол-ва чисел
        int[] arr = new int[kolArr];

        for (int i=0; i<kolArr; i++){        //заполнение массива числами
            int numsArr = scan.nextInt();
            arr[i] = numsArr;
        }

        int num1 = scan.nextInt();    //ввод числа №1 для перестановки
        int num2 = scan.nextInt();    //ввод числа №2 для перестановки

        if ((num1 >= 0 && num1 <= kolArr-1) && (num2 >= 0 && num2 <= kolArr-1)){
            int temp = arr[num1];    //перестановка чисел массива
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
        else System.out.println("Вышли за границу заданного массива.");

        for (int i=0; i<kolArr; i++){        //вывод на экран числа массива
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
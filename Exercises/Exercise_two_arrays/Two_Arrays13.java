package Exercise_two_arrays;
import java.util.Scanner;

/*Дан массив, состоящий из целых чисел. Напишите программу,
которая определяет, есть ли в массиве пара соседних элементов с одинаковыми знаками.*/

class Two_Arrays13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] array = new int[num];                 //считываем число с консоли и создаем массив

        for (int i = 0; i < array.length; i++){     //записываем числа с консоли в массив
            int temp = scan.nextInt();
            array[i] = temp;
        }
        scan.close();

        boolean verify = false;
        int chislo = 0;
        for (int i = 0; i < array.length; i++){     //проверяем, есть ли числа с одинаковыми знаками
            if ((chislo<0 && array[i]<0) || (chislo>0 && array[i]>0)){
                verify = true;
            }
            chislo = array[i];
        }
        if (verify){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
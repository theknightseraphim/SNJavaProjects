package Exercise_arrays;
import java.util.Scanner;

/*Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.*/

class Arrays7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод размерности массива
        int[] arr = new int[kolArr];

        for (int i=0; i<kolArr; i++){        //заполнение массива числами
            int numsArr = scan.nextInt();
            arr[i] = numsArr;
        }

        for (int i=0; i<kolArr; i++){        //проверка на повторяемость и вывод значений на экран
            int count = 0;
            for (int k=0; k<kolArr; k++){
                if (arr[k] == arr[i]){
                    count++;
                }
            }
            if (count == 1) System.out.println(arr[i]);
        }
        scan.close();
    }
}
package Exercise_arrays;
import java.util.Scanner;

/*Программа получает на вход невозрастающую последовательность натуральных чисел
(сначала вводится количество, затем сами числа), означающих рост каждого человека в строю.
После этого вводится число X – рост Пети.
Все числа во входных данных натуральные и не превышают 200.*/

class Arrays6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolArr = scan.nextInt();        //ввод размерности массива
        int[] arr = new int[kolArr];
        /*if (kolArr>0){
           int[] arr = new int[kolArr];
        }*/

        for (int i=0; i<kolArr; i++){        //заполнение массива числами
            int numsArr = scan.nextInt();
            if (numsArr>0 && numsArr <= 200){
                arr[i] = numsArr;
            }
        }

        int peterHeight = scan.nextInt();    //ввод роста Пети
        for (int i=kolArr-1; i>-1; i--){        //сравнение по росту
            if (peterHeight<=arr[i]){
                System.out.println(i+2);
                break;
            }
        }
        scan.close();
    }
}
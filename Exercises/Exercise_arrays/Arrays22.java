package Exercise_arrays;
import java.util.Scanner;

/*Вводится число n.
Затем вводится 2 раза по n действительных чисел - два массива.
Вывести на экран их сумму.*/

class Arrays22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] array1 = new double[num];
        double[] array2 = new double[num];               //создание массивов с размером числа из консоли

        for (int i = 0; i < num; i++){   //заполнение 1 массива числами из консоли
            double nums = scan.nextDouble();
            array1[i] = nums;
        }
        for (int i = 0; i < num; i++){   //заполнение 2 массива числами из консоли
            double nums = scan.nextDouble();
            array2[i] = nums;
        }

        double sum = 0;
        for (int i = 0; i < num; i++){   //суммирование 2ух массивов
            sum = array1[i] + array2[i];
            System.out.println(sum);
            sum = 0;
        }
        scan.close();
    }
}
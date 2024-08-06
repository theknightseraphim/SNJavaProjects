package Exercise_two_arrays;
import java.util.Scanner;

/*Дан зубчатый двумерный массив. Необходимо определить номер строки с максимальной суммой,
максимальную сумму и саму строку, которая даёт эту сумму.
Вводится число n - количество строк зубчатого массива.
Затем информация вводится следующими блоками:
число k - количество элементов в строке и потом k элементов.*/

class Two_Arrays6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int columns = scan.nextInt();                    //ввод кол-ва пар строк
        int colNum = 0;
        int sum = Integer.MIN_VALUE;
        String nums = "";

        for (int i = 0; i < columns; i++){
            int raws = scan.nextInt();
            int[] array = new int[raws];                //создание массива размерностью из консоли

            int sumTemp = 0;                            //ввод кол-ва чисел строки, самих чисел, их суммирование
            String numsTemp = "";
            for (int k = 0; k < array.length; k++){
                int numbers = scan.nextInt();
                sumTemp += numbers;
                numsTemp += numbers + " ";
            }
            if (sumTemp > sum){
                colNum = i;
                sum = sumTemp;
                nums = numsTemp;
            }
        }
        System.out.println(colNum+1);
        System.out.println(sum);
        System.out.println(nums);
        scan.close();

        //Более элегантное решение
        /*
        if (console.hasNextInt()) {
            int min = console.nextInt();
            while (console.hasNextInt()) {
                int x = console.nextInt();
                if (x < min) min = x;
            }
        }
        */
    }
}
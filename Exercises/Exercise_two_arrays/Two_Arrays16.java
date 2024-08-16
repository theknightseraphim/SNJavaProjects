package Exercise_two_arrays;
import java.util.Scanner;

/*Дано число n (n < 10).
Создайте массив n×n и заполните его по следующему правилу:
- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
- числа, стоящие выше этой диагонали, равны 0;
- числа, стоящие ниже этой диагонали, равны 2.*/

class Two_Arrays16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        scan.close();

        int temp = size-1;
        for (int i = 0; i < size; i++){
            for (int k = 0; k < size; k++){
                if (k == temp){
                    array[i][k] = 1;
                    temp--;
                }
                else if (k > temp){
                    array[i][k] = 2;
                }
            }
        }

        for (int i = 0; i < size; i++){
            for (int k = 0; k < size; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }
    }
}
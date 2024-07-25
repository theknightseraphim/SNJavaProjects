package Exercise_arrays;
import java.util.Scanner;

/*Нужно принять диапазон чисел от a до b. Затем числа, из этого диапазона, возвести в 3 степень.
Затем принимается количество чисел, которые будут вводиться.
Этим самые числа мы должны проверить, входят ли они в диапазон.
Если входят - вывести куб числа. Если нет - Erorr.*/

class Arrays9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int[] arr = new int[num2-num1];

        for (int i=0; i<arr.length; i++){        //заполнение массива числами в степени 3
            arr[i] = (int) Math.pow(num1, 3);
            num1 += 1;
        }

        boolean flag = false;
        for (int i=0; i<arr.length; i++){
            int numbers = scan.nextInt();
            for (int k=0; k<arr.length; k++){
                if ((int) Math.pow(numbers, 3) == arr[k]){
                    flag = true;
                    break;
                }
                else flag = false;
            }
            if (flag){
                System.out.println((int) Math.pow(numbers, 3));
            }
            else System.out.println("Error");
        }
        scan.close();
    }
}
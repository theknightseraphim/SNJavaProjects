package Exercise_for;

import java.util.Scanner;

/*Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.*/

class MyProgram17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        for (int i = num1; num1 <= num2; num1++){
            sum += num1;
            //System.out.println("summa chisel " + sum);
        }
        System.out.println(sum);
        scan.close();
    }
}
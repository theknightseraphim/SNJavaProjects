package Exercise_while;

import java.util.Scanner;

/*Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0. Найти количество введенных чисел (0 не считается)*/

class MyProgram11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int count = 0;

        while (numbers != 0)
        {
            count++;
            numbers = scan.nextInt();
        }
        System.out.println(count);
        scan.close();
    }
}
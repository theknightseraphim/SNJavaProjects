package Exercise_while;

import java.util.Scanner;

/*Программа запрашивает два числа: n и x.
Необходимо составить программу, которая будет прибавлять число x само к себе до тех пор,
пока сумма не станет больше либо равна n. Выведите полученную сумму.*/

class MyProgram13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        int sum = 0;

        while (sum < num1)
        {
            sum += num2;
        }
        System.out.println(sum);
    }
}
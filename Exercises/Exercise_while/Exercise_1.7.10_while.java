package Exercise_while;

import java.util.Scanner;

/*Вводятся два целых числа k (1 <= k <= 10) и n (0 <= n <= 100).
Выведите на экран построчно все числа кратные k от 1 до n включительно.*/

class MyProgram10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        if ((num1>=1 && num1<=10) && (num2>=0 && num2<=100))
        {
            int numbers = num1;
            while (numbers<=num2)
            {
                if (numbers%num1 == 0)
                {
                    System.out.println(numbers);
                }
                numbers++;
            }
        }
    }
}
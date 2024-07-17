package Exercise_for;/*Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел.
Необходимо определить и вывести на экран минимальное и максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное значения
часто используются -2*109 и 2*109 соответственно. Но в олимпиадных задачах всегда смотрите
на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).*/

import java.util.Scanner;

class MyProgram20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int number = scan.nextInt();
        int min = number;
        int max = number;

        if (num1 > 1){
            for (int i = 1; i <= num1-1; i++){
                number = scan.nextInt();

                if (Math.min(number, min) == number){
                    min = number;
                }
                if (Math.max(number, max) == number){
                    max = number;
                }
            }
            System.out.println("Minimum " + min);
            System.out.println("Maximum " + max);
        }

        else if (num1 == 1) {
            System.out.println(num1);
            System.out.println(num1);
        }
        scan.close();
    }
}
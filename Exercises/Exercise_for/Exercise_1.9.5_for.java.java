package Exercise_for;/*
Вводится натуральное число n. Вычислите n! ("эн-факториал") –
произведение всех натуральных чисел от 1 до n
n! = 1∙2∙3∙…∙ n.
*/

import java.util.Scanner;

class MyProgram21{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact = 1;

        while (number > 0){
            for (int i = 1; i < number; i++){
                fact *= i+1;
            }
            break;
        }
        System.out.println(fact);
        scan.close();
    }
}
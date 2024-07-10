package Exercise_for;
import java.util.Scanner;

/*Напишите программу, которая находит сумму натуральных чисел от 1 до n, где n вводится с клавиатуры.*/

class MyProgram25{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < number+1; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
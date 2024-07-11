package Exercise_for;
import java.util.Scanner;

/*Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.*/

class MyProgram31{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 1; i < 10; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }

        scan.close();
    }
}
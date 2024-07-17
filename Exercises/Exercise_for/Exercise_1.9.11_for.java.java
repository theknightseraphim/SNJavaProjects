package Exercise_for;
import java.util.Scanner;

/*Напишите программу, которая выводила бы на экран числа (например число а) следующим образом:
a a.$*/

class MyProgram27{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for ( ; num1 <= num2; num1++){
            System.out.println(num1 + " " + num1 + ".$");
        }
    }
}
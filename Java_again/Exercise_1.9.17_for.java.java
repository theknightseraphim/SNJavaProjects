package Exercise_for;
import java.util.Scanner;

/*Дано натуральное число. Найдите произведение его цифр.*/

class MyProgram33{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int proizv = 1;

        for (; number !=0; number/=10){
            proizv *= number%10;
        }
        System.out.println(proizv);
    }
}
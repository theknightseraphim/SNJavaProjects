import java.util.Scanner;

/*Пользователь вводит натуральные числа по одному на каждой строке.
Когда ему надоедает, то он вводит 0. Найти сумму введенных чисел (0 не считается)*/

class MyProgram12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        int sum = 0;

        while (numbers != 0)
        {
            sum += numbers;
            numbers = scan.nextInt();
        }
        System.out.println(sum);
        scan.close();
    }
}
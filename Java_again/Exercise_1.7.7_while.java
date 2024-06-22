import java.util.Scanner;

/*Дано натуральное число N. Напишите программу, вычисляющую сумму цифр числа N.*/
/*      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
*/

class MyProgram7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        while (number>=0){
            int num1 = number%10;
            int num2 = (number%100)/10;
            int num3 = (number%1000)/100;
            int num4 = (number%10000)/1000;
            int num5 = (number%100000)/10000;
            int num6 = (number%1000000)/100000;
            System.out.println(num1 + num2 + num3 + num4 + num5 + num6);
            break;
        }
    }
}
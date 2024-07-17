package Exercise_for;
import java.util.Scanner;

/*Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.
Переведите число n из десятичной системы счисления в систему счисления с основанием k.*/

class MyProgram38{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int system = scan.nextInt();
        String nums = "";

        if (number == 0){
            System.out.print(0);
        }
        else if (number !=0 && 2 <= system && system < 10){
            for (; number > 0; number /= system){
                int num = number%system;
                nums += Integer.toString(num);
            }
        }

        StringBuilder builder = new StringBuilder(nums);
        builder.reverse();
        String result = builder.toString();
        System.out.print(result);
    }
}
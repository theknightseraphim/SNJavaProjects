import java.util.Scanner;

/*Программа запрашивает натуральное число n.
Необходимо составить программу, которая будет считывать целые числа до тех пор,
пока их произведение не станет больше либо равна n.
Выведите через пробел количество введенных чисел и их произведение.

Примечание: подумайте, что произойдёт, если n равно 1.*/

class MyProgram14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int num3 = num2;
        int count = 1;

        while (num3 < num1){
            num2 = scan.nextInt();
            num3 *= num2;
            count++;
        }
        System.out.println(count + " " + num3);
        scan.close();
    }
}


/*      Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        int num2 = 0;
        int num3 = 0;
        int count = 0;

        while (Math.abs(num3 * num2) < num1)
        {
            num3 = num2;
            num2 = scan.nextInt();
            count++;
        }
        System.out.println(count + " " + Math.abs(num3 * num2));
        scan.close();
*/
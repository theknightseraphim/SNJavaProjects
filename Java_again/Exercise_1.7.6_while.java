import java.util.Scanner;

/*В первый день спортсмен пробежал x километров,
а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
Программа получает на вход действительные числа x и y.
Программа должна вывести одно натуральное число.
*/

class MyProgram6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        int num2 = scan.nextInt();
        scan.close();

        int countDays = 1;

        while (num1 < num2){
            num1 = num1*1.1;
            countDays++;
        }
        System.out.println(countDays);
    }
}
import java.util.Scanner;

/*Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        while (a%i != 0) {
            i++;
        }
        System.out.print(i);
    }
}
*/

class MyProgram4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        if (number >= 2){
            if (number%2==0 || (number%2==0 && number%3==2)){
                System.out.println(2);
            }
            else if (number%3==0) {
                System.out.println(3);
            }
            else if (number%5==0) {
                System.out.println(5);
            }
            else if (number%7==0) {
                System.out.println(7);
            }
            else System.out.println(number);
        }
        else System.out.println("Please use number >= 2.");
    }
}
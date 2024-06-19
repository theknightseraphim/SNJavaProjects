import java.util.Scanner;

/*Вводятся целые числа a и b. Гарантируется, что a не превосходит b.
Выведите все четные числа от a до b (включительно).*/

class MyProgram3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        while (num1 <= num2)
        {
            if (num1%2==0)
            {
                System.out.println(num1);
            }
            num1++;
        }
    }
}
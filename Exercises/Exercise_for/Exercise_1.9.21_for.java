package Exercise_for;
import java.util.Scanner;

/*Вводится натуральное число n. Необходимо определить количество его делителей.*/

class MyProgram37{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++){
            if (number%i == 0){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
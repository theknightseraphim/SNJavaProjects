package Exercise_for;
import java.util.Scanner;

/*Маша занималась обработкой больших и не очень больших данных.
На её компьютер время от времени приходили числа и она хотела понять, каких больше:
кратных 3, или отрицательных. Помогите Маше с её вопросом.
Вводятся целые числа до тех пор, пока не будет введён 0.
Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел,
то выведите "negative", если их одинаковое количество, то выведите "Equal".*/

class MyProgram39{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int countThree = 0;
        int countNeg = 0;
        int number = 1;

        while (number != 0){
            number = scan.nextInt();
            if (Math.abs(number%3) == 0){
                countThree++;
            }
            if (number < 0) countNeg++;
        }
        if (countThree-1 > countNeg){
            System.out.println(333);
        }
        else if (countThree-1 < countNeg){
            System.out.println("negative");
        }
        else System.out.println("Equal");
    }
}
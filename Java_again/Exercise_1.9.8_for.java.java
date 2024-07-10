package Exercise_for;
import java.util.Scanner;

/*Последовательность состоит из натуральных чисел и завершается числом 0.
Всего вводится не более 10000 чисел (не считая завершающего числа 0).
Определите, сколько элементов этой последовательности равны ее наибольшему элементу.

Числа, следующие за числом 0, считывать не нужно.*/

class MyProgram24{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int count = 0;

        for (int number = scan.nextInt(); number!=0; number = scan.nextInt()){
            if (max < number){
                max = number;
                count = 0;
            }
            if (max == number){
                count++;
            }
        }
        System.out.println(count);
    }
}
package Exercise_while;

import java.util.Scanner;

/*Последовательность состоит из различных натуральных чисел и завершается числом 0.
Определите значение второго по величине элемента в этой последовательности.

Числа, следующие за числом 0, считывать не нужно.

Вводится последовательность целых чисел, оканчивающаяся числом 0
(само число 0 в последовательность не входит). Гарантируется, что будет введено хотя бы 2 числа.*/

class MyProgram9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int numPrevPrev = 0;
        int numPrev = 0;

        while (number!=0){
            if (number > numPrev){
                numPrevPrev = numPrev;
                numPrev = number;
            }
            if (numPrevPrev < number && number < numPrev){
                numPrevPrev = number;
            }
            number = scan.nextInt();
        }
        System.out.println(numPrevPrev);
        scan.close();
    }
}
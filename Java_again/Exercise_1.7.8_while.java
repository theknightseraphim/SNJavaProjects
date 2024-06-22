import java.util.Scanner;

/*Последовательность состоит из натуральных чисел и завершается числом 0.
Определите, сколько элементов этой последовательности больше предыдущего элемента.
Гарантируется ввод хотя бы двух ненулевых чисел.

Числа, следующие за числом 0, считывать не нужно.*/

class MyProgram8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int count = 0;

        while (number!=0){
            int numPrev = number;
            number = scan.nextInt();
            if (number > numPrev){
                count++;
            }
            //System.out.println(count);
        }
        System.out.println(count);
        scan.close();
    }
}
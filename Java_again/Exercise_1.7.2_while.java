import java.util.Scanner;

/*Последовательность состоит из различных натуральных чисел и завершается числом 0.
Определите значение максимального элемента в этой последовательности.
Числа, следующие за числом 0, считывать не нужно.*/

class MyProgram2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int compare = scan.nextInt();
        int number = scan.nextInt();

        while (number != 0) {
            number = scan.nextInt();
            if (compare < number && compare > 0){
                compare = number;
            }
            else if (compare < 0 && compare > number){
                compare = number;
            }
        }
        System.out.println(compare);
    }
}
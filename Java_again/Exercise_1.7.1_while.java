import java.util.Scanner;

/* Пользователь с клавиатуры вводит действительные числа до 0. Необходимо вычислить их среднее арифметическое.
 * Гарантируется, что он введёт хотя бы одно ненулевое число.*/

class MyProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double sum = 0;
        int count = 0;

        while (number != 0) {
            count++;
            sum += number;
            number = scan.nextInt();

        }
        System.out.println(sum / count);
    }
}
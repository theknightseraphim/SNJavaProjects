package Exercise_other;
import java.util.Random;
import java.util.Scanner;

/*Компьютер «загадывает» число от 0 до 1000, а вам нужно угадать это число.
На каждый ваш вариант компьютер должен говорить либо «Больше», если загаданное число больше,
или «Меньше», если наоборот.*/

class Otgaday_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        while (userInput != randomInt){ // В этой переменной должен сохраняться ввод пользователя
            userInput = scanner.nextInt();
            if (userInput > randomInt) { // Условие проверяется в цикле
                System.out.println("Меньше");
            }
            else if (userInput < randomInt){ // Второе условие
                System.out.println("Больше");
            }
            if (userInput == randomInt){
                System.out.println("Вы великолепны! Именно это я загадал."); // Печатаем, когда число угадано
            }
        }
    }
}
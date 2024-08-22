package Exercise_String;
import java.util.Scanner;

/*Вводится строка, определите, каких символов в ней больше: цифр или букв?
Напоминаю, что знаки препинания и пробелы, например, не являются ни тем ни другим.
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".*/

class exsString8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char[] arrayChar = line.toCharArray();
        scan.close();

        int countDigit = 0;
        int countLetter = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.isDigit(arrayChar[i])) {
                countDigit++;
            }
            else if (Character.isLetter(arrayChar[i])) {
                countLetter++;
            }
        }

        if (countDigit > countLetter) {
            System.out.println("Digit");
        }
        else if (countLetter > countDigit) {
            System.out.println("Letter");
        }
        else if (countLetter == countDigit) {
            System.out.println("Equal");
        }
    }
}
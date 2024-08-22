package Exercise_String;
import java.util.Scanner;

/*Вводится строка. Уберите из неё все символы, которые не являются ни цифрой, ни буквой, ни пробелом.*/

class exsString9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arrayChar = scan.nextLine().toCharArray();
        scan.close();

        String newLine = "";
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.isLetterOrDigit(arrayChar[i]) || Character.isWhitespace(arrayChar[i])) {
                newLine += arrayChar[i];
            }
            else continue;
        }

        System.out.println(newLine.trim());
    }
}
package Exercise_String;
import java.util.Scanner;

/*Вводится число n, затем n строчек, которые необходимо соединить.
После вводится ещё одна строка - которая должна быть в качестве разделителя.
Выведите одну строку - все введённые выше слова через разделитель.*/

class exsString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] arrayString = new String[number];

        for (int i = 0; i < arrayString.length; i++) {
            String words = scan.next();
            arrayString[i] = words;
        }

        String delimeter = scan.next();
        scan.close();
        String phrase = String.join(delimeter, arrayString);
        System.out.println(phrase);
    }
}
package Exercise_String;
import java.util.Scanner;

/*Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите,
сколько раз в тексте встречается введённый символ в любом регистре.
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.*/

class exsString7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] arrayLine = line.split("");
        String letter = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < arrayLine.length; i++){
            if (arrayLine[i].equalsIgnoreCase(letter)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
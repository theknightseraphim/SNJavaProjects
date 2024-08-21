package Exercise_String;
import java.util.Scanner;

/*Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова,
которые начинаются на её любимую букву и заканчиваются на любимую букву её друга Олега.
Олег делает наоборот.*/

class exsString3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter1 = scan.next().toLowerCase();
        String letter2 = scan.next().toLowerCase();
        scan.nextLine();
        String text = scan.nextLine().toLowerCase();    //считали строку понизив регистр
        String[] words = text.split(" ");
        scan.close();

        int countLetter1 = 0;
        int countLetter2 = 0;
        for (int i = 0; i < words.length; i++) {
            Integer temp1 = words[i].lastIndexOf(letter1);  //letter1 is last
            Integer temp2 = words[i].lastIndexOf(letter2);  //letter2 is last
            if (words[i].indexOf(letter1) == 0 && temp2.equals(words[i].length()-1)) {
                countLetter1++;
            }
            else if (words[i].indexOf(letter2) == 0 && temp1.equals(words[i].length()-1)) {
                countLetter2++;
            }
        }

        System.out.println(countLetter1);
        System.out.println(countLetter2);
    }
}
package Exercise_String;
import java.util.Scanner;

/*
Дана строка.
Сначала выведите третий символ этой строки.
Во второй строке выведите предпоследний символ этой строки.
В третьей строке выведите первые пять символов этой строки.
В четвертой строке выведите всю строку, кроме последних двух символов.
На пятой строке выведите всю строку, кроме первых 3 символов.
На шестой строке выведите длину данной строки.
Гарантируется, что вводится строчка, состоящая не менее, чем из 5 символов.
*/

class exsString1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        System.out.println(line.charAt(2));
        System.out.println(line.charAt(line.length()-2));
        System.out.println(line.substring(0, 5));
        System.out.println(line.substring(0, line.length()-2));
        System.out.println(line.substring(3));
        System.out.println(line.length());
    }
}
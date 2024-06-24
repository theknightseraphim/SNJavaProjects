import java.util.Scanner;

/*Вводятся натуральное число n.
Выведите на экран лесенку, состоящую из n ступенек.
Каждая i-ая ступенька состоит из i звёздочек.*/

class MyProgram15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolStars = scan.nextInt();
        scan.close();

        String star = "*";

        while (kolStars-- != 0) {
            System.out.println(star);
            star += "*";
        }
    }
}
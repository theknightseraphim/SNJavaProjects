import java.util.Scanner;

/*Вводятся натуральное число n.
Выведите на экран пирамидку, состоящую из n слоёв.*/

class MyProgram16{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolStars = scan.nextInt();
        scan.close();

        String star = "*";
        String probel = " ";

        while (kolStars-- != 0) {
            System.out.print(probel.repeat(kolStars));
            System.out.println(star);
            star += "**";
        }
    }
}
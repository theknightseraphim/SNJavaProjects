package Exercise_for;
import java.util.Scanner;

/*Напишите программу, которая по введенному с клавиатуры числу выводит соответствующее число сов.
Картинка тетушки Совы состоит из символов. Размер одной картинки 5 на 11 символов.

:)\_____/(:
 {(@)v(@)}
 {|~- -~|}
 {/^'^'^\}
 ===m-m===
Между двумя соседними совами имеется пустая строка.*/

class MyProgram32{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolHowls = scan.nextInt();

        for (int i = 1; i <= kolHowls; i++){
            System.out.println(":)\\_____/(:");
            System.out.println(" {(@)v(@)} ");
            System.out.println(" {|~- -~|} ");
            System.out.println(" {/^'^'^\\} ");
            System.out.println(" ===m-m=== ");
            System.out.println("");
        }
    }
}
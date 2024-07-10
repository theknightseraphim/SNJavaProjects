package Exercise_for;
import java.util.Scanner;

/*Составьте программу, которая в одну строку через пробел выводит все нечетные цифры.*/

class MyProgram29{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolNum = scan.nextInt();

        for (int i = 0; i < kolNum; i++){
            //int numbers = scan.nextInt();
            if (i%2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}
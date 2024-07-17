package Exercise_for;
import java.util.Scanner;

/*Вводится количество чисел n, затем n чисел.
Необходимо выяснить есть ли среди них такое, которое заканчивается на 4?
Если такое число имеется среди введённых выведите на экран слово "Yes", иначе "No".*/

class MyProgram34{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numKol = scan.nextInt();
        boolean del4 = false;
        int numbers = 0;

        for (int i = 0; i < numKol; i++){
            numbers = scan.nextInt();
            if (numbers%10==4){
                del4 = true;
            }
        }
        if (del4){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
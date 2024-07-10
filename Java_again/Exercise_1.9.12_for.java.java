package Exercise_for;
import java.util.Scanner;

/*Составьте программу, которая запрашивает ввод n чисел и считает их произведение.*/

class MyProgram28{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kolNum = scan.nextInt();
        long proizv = 1;

        for (int i = 0; i < kolNum; i++){
            int numbers = scan.nextInt();
            proizv *= numbers;
        }
        System.out.println(proizv);
    }
}
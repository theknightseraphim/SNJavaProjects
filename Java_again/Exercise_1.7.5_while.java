/*По-данному натуральному n вычислите сумму 12+22+...+n2.*/

import java.util.Scanner;

class MyProgram5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        int sum = 0;
        int count = 0;

        if (number>0){
            while (count<=number){
                sum += (count * count);
                count++;
            }
            System.out.println(sum);
        }
        else if (number<0){
            while (count>=number){
                sum -= (count * count);
                count--;
            }
            System.out.println(sum);
        }
    }
}
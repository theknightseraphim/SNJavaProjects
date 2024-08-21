package Exercise_String;
import java.util.Scanner;

/*Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.*/

class exsString4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ipNumbers = scan.nextLine().split("\\.");

        int count = 0;
        for (int i = 0; i < ipNumbers.length; i++) {
            if (!ipNumbers[i].isEmpty()) {
                if (Integer.parseInt(ipNumbers[i]) < 0 || Integer.parseInt(ipNumbers[i]) > 255 || ipNumbers[i].equals("")) {
                    continue;
                }
                else count++;
            }
            else break;
        }
        System.out.println(count == 4 ? "YES" : "NO");

        /*Не учёл того, что могут вводить символы отличные от цифр.*/
    }
}
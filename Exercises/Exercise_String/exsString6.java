package Exercise_String;
import java.util.Scanner;

/*Вводится строка, найдите, сколько раз в ней встречается буква "f".
Подсчитайте количество вхождений только "маленькой буквы".*/

public class exsString6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char[] result = line.toCharArray();
        scan.close();

        int count = 0;
        for (int i = 0; i < result.length; i++){
            if (result[i] == 'f') {
                count++;
            }
        }
        System.out.println(count);
    }
}

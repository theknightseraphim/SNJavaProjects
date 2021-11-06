import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное число
*/

public class ocenki {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ocenka1 = Integer.parseInt(reader.readLine());
        int ocenka2 = Integer.parseInt(reader.readLine());
        int ocenka3 = Integer.parseInt(reader.readLine());

        int count = 0;

        if (ocenka1%2 == 0 && ocenka1 >= 1)
            count++;
        if (ocenka2%2 == 0 && ocenka2 >= 1)
            count++;
        if (ocenka3%2 == 0 && ocenka3 >= 1)
            count++;
        System.out.println(count);

        /*if (ocenka1 > 0 && ocenka2 > 0 && ocenka3 > 0){
            System.out.println(3);
        }
        else if (ocenka1 > 0 && ocenka2 > 0){
            System.out.println(2);
        }
        else if (ocenka2 > 0 && ocenka3 > 0){
            System.out.println(2);
        }
        else if (ocenka1 > 0 && ocenka3 > 0){
            System.out.println(2);
        }
        else if (ocenka1 > 0 && ocenka2 < 0 && ocenka3 < 0){
            System.out.println(1);
        }
        else if (ocenka1 < 0 && ocenka2 > 0 && ocenka3 < 0){
            System.out.println(1);
        }
        else if (ocenka1 < 0 && ocenka2 < 0 && ocenka3 > 0){
            System.out.println(1);
        }
        else System.out.println(0);*/
    }
}
